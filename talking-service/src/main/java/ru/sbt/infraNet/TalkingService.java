package ru.sbt.infraNet;

public interface TalkingService extends AuthentificationService {
    boolean addCommentWithAuthentification(String comment, ContentServerImpl contentServerImpl);
}
