package ru.sbt.infraNet;

import java.util.List;

public class AccountsBase {
    private final List<UserAccount> accountsBase;

    public AccountsBase(List<UserAccount> accountsBase) {
        this.accountsBase = accountsBase;
    }

    public List<UserAccount> getAccountsBase() {
        return accountsBase;
    }
}
