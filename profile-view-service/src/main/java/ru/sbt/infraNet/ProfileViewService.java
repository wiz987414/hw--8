package ru.sbt.infraNet;

public interface ProfileViewService extends AuthentificationService {
    boolean profileViewWithAuthorisation(AccountsBase accountsBase);
}
