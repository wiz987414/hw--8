package ru.sbt.infraNet;

public interface ContentManageService extends AuthentificationService, ContentViewService {
    boolean removeContent(ContentServerImpl contentServerImpl);
}
