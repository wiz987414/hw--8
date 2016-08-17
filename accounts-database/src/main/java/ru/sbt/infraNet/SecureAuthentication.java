package ru.sbt.infraNet;

public interface SecureAuthentication {
    boolean securePasswordCheck(String passwordHash, String saltHash);
    String[] getPasswordHash(String password);
}
