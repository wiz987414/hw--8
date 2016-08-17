package ru.sbt.infraNet;

public interface ApplicationsService extends AuthentificationService {
    void applicationExecuteWithAuthorisation(ContentServerImpl contentServerImpl, Application application);

    void applicationSearch(ContentServerImpl contentServerImpl, Application application);
}
