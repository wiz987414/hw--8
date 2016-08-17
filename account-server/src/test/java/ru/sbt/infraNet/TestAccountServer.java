package ru.sbt.infraNet;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class TestAccountServer {
    @Mock
    AccountsBase accountsBase;
    @Mock
    ProfilesBase profilesBase;
    @Mock
    AccountServerImpl accountServer;

    @Before
    public void setUp() throws Exception {
        UserAccount testUser = new UserAccount("us1", "abc12", "cba321", Calendar.getInstance());
        List<UserAccount> testList = new ArrayList<>();
        testList.add(testUser);
        accountsBase = new AccountsBase(testList);
        profilesBase = new ProfilesBase(new ArrayList<>());
        accountServer = new AccountServerImpl(accountsBase, profilesBase);
    }

    @Test
    public void passwordCheckTest() {
        assertEquals(true, accountServer.securePasswordCheck("abc12", "cba321"));
    }

    @Test
    public void WromgpasswordCheckTest() {
        assertEquals(false, accountServer.securePasswordCheck("1", "cba321"));
    }
}

