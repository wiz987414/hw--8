package ru.sbt.infraNet;

import java.util.List;

public class ProfilesBase {
    private final List<UserProfile> profilesBase;

    public ProfilesBase(List<UserProfile> profilesBase) {
        this.profilesBase = profilesBase;
    }

    public List<UserProfile> getProfilesBase() {
        return profilesBase;
    }
}
