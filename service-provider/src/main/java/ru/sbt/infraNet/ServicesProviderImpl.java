package ru.sbt.infraNet;

import java.util.Objects;

public class ServicesProviderImpl implements ServicesProvider {
    private final AccountServerImpl accountsServer;
    private final UserAccount currentUser;

    public ServicesProviderImpl(AccountServerImpl accountsServer,
                                UserAccount currentUser) {
        this.accountsServer = accountsServer;
        this.currentUser = currentUser;
    }

    @Override
    public boolean userAuthentification(AccountServerImpl accountsServer, String userID, String userPass) {
        for (UserAccount checkUser : accountsServer.getUsersAccounts().getAccountsBase()) {
            if (Objects.equals(checkUser.getUserID(), userID)) {
               return accountsServer.securePasswordCheck(accountsServer.getPasswordHash(userPass)[0], checkUser.getUserSaultHash());
            }
        }
        return false;
    }

    @Override
    public boolean userAuthorisation(String userFirstName, String userLastName) {
        return false;
    }

    @Override
    public boolean checkAccount(AccountServerImpl accountServerImpl) {
        return false;
    }

    @Override
    public boolean addFriendWithAuthentification(String userPassword, String addedUserName) {
        return false;
    }

    @Override
    public boolean addGift(Gift addedGft, AccountServerImpl accountServerImpl, String receiveUser, String targetUser) {
        return false;
    }

    @Override
    public boolean profileViewWithAuthorisation(AccountsBase accountsBase) {
        return false;
    }

    @Override
    public boolean removeContent(ContentServerImpl contentServerImpl) {
        return false;
    }

    @Override
    public MultimediaContent findMultimedia(ContentServerImpl contentServerImpl) {
        return null;
    }

    @Override
    public boolean addCommentWithAuthentification(String comment, ContentServerImpl contentServerImpl) {
        return false;
    }

    @Override
    public void getServicesParemeters() {

    }

    @Override
    public void applicationExecuteWithAuthorisation(ContentServerImpl contentServerImpl, Application application) {
        if (this.userAuthentification(this.accountsServer, this.currentUser.getUserID(), this.currentUser.getUserPassHash())){
            if (contentServerImpl.getApplicationBase().getApplications().contains(application) &&
                    application.getClass() == MobileApplication.class)
                application.applicationExecute(contentServerImpl.getApplicationBase());
        }


    }

    @Override
    public void applicationSearch(ContentServerImpl contentServerImpl, Application application) {

    }
}
