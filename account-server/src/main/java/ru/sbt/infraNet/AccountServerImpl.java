package ru.sbt.infraNet;

import java.net.URL;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

public class AccountServerImpl implements SecureAuthentication, AccountsServer {
    private final AccountsBase usersAccounts;
    private final ProfilesBase usersProfiles;


    public AccountServerImpl(AccountsBase usersAccounts,
                             ProfilesBase usersProfiles) {
        this.usersAccounts = usersAccounts;
        this.usersProfiles = usersProfiles;
    }

    @Override
    public boolean securePasswordCheck(String passwordHash, String saltHash) {
        boolean checkStatus = false;
        for (UserAccount checkAccount : this.getUsersAccounts().getAccountsBase())
            if (Objects.equals(checkAccount.getUserPassHash(), passwordHash) &&
                    Objects.equals(checkAccount.getUserSaultHash(), saltHash))
                checkStatus = true;
        return checkStatus;
    }

    @Override
    public String[] getPasswordHash(String password) {
        String[] rezultHash = new String[2];
        rezultHash[0] = password + "pass";
        rezultHash[2] = password + "salt";
        return rezultHash;
    }

    public AccountServerImpl createAccount(String userID,
                                           String password,
                                           String userFirstName,
                                           String userLastName,
                                           String userSurName,
                                           URL userPhotoUrl) {
        String[] userHash = this.getPasswordHash(password);
        UserAccount newUserAccount = new UserAccount(userID,
                userHash[0],
                userHash[2],
                Calendar.getInstance());
        UserProfile newUserProfile = new UserProfile(userID,
                userFirstName,
                userLastName,
                userSurName,
                userPhotoUrl);
        AccountsBase rezultAccBase = this.getUsersAccounts();
        rezultAccBase.getAccountsBase().add(newUserAccount);
        ProfilesBase rezultProfBase = this.getUsersProfiles();
        rezultProfBase.getProfilesBase().add(newUserProfile);
        return new AccountServerImpl(rezultAccBase, rezultProfBase);
    }

    public AccountsBase getUsersAccounts() {
        return usersAccounts;
    }

    public ProfilesBase getUsersProfiles() {
        return usersProfiles;
    }

    @Override
    public boolean serverStatusCheck() {
        return false;
    }
}
