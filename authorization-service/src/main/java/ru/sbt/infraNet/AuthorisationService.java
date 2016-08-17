package ru.sbt.infraNet;

public interface AuthorisationService {
    boolean userAuthorisation(String userFirstName, String userLastName);
    boolean checkAccount(AccountServerImpl accountServerImpl);
}
