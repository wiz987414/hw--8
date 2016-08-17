package ru.sbt.infraNet;

public interface FriendsListManageService extends AuthentificationService {
    boolean addFriendWithAuthentification(String userPassword, String addedUserName);
}
