package ru.sbt.infraNet;

import java.net.URL;

public class UserProfile {
    private final String userID;
    private final String userFirstName;
    private final String userLastName;
    private final String userSurName;
    private final URL userPhotoUrl;

    public UserProfile(String userID,
                       String userFirstName,
                       String userLastName,
                       String userSurName,
                       URL userPhotoUrl) {
        this.userID = userID;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userSurName = userSurName;
        this.userPhotoUrl = userPhotoUrl;
    }
}
