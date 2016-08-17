package ru.sbt.infraNet;

public interface GiftsService extends AuthentificationService {
    boolean addGift(Gift addedGft, AccountServerImpl accountServerImpl, String receiveUser, String targetUser);
}
