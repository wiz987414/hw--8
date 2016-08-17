package ru.sbt.infraNet;

import java.util.Calendar;

public class UserAccount {
    private final String userID;
    private final String userPassHash;
    private final String userSaultHash;
    private final Calendar accountCreateDate;

    public UserAccount(String userID,
                       String userPassHash,
                       String userSaltHash,
                       Calendar accountCreateDate) {
        this.userID = userID;
        this.userPassHash = userPassHash;
        this.userSaultHash = userSaltHash;
        this.accountCreateDate = accountCreateDate;

    }

    public String getUserID() {
        return userID;
    }

    public String getUserPassHash() {
        return userPassHash;
    }

    public String getUserSaultHash() {
        return userSaultHash;
    }

    public Calendar getAccountCreateDate() {
        return accountCreateDate;
    }
}
