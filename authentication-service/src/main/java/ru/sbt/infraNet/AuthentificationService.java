package ru.sbt.infraNet;

public interface AuthentificationService {
    boolean userAuthentification(AccountServerImpl accountsServer, String userID, String userPass);
}
