package ru.sbt.infraNet;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestApplicationDatabase {
    MobileApplication mobileApplication = new MobileApplication(null, "egzample", null, "Author");
    List<Application> appList = new ArrayList<Application>();
    ApplicationBase appBase = new ApplicationBase(appList);

    @Test (expected = NullPointerException.class)
    public void emptyExecuteTest() {
        mobileApplication.applicationExecute(null);
    }

    @Test
    public void correctExecuteTest(){
        appBase.getApplications().add(mobileApplication);
        mobileApplication.applicationExecute(appBase);
    }
}
