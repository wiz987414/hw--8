package ru.sbt.infraNet;

import java.net.URL;
import java.util.Map;

public class MobileApplication implements Application {
    private final URL applicationSource;
    private final String title;
    private final Map<String, Object> applicationSettings;
    private final String crearor;

    public MobileApplication(URL applicationSource,
                             String title,
                             Map<String, Object> applicationSettings,
                             String crearor) {
        this.applicationSource = applicationSource;
        this.title = title;
        this.applicationSettings = applicationSettings;
        this.crearor = crearor;
    }

    public URL getApplicationSource() {
        return applicationSource;
    }

    public Map<String, Object> getApplicationSettings() {
        return applicationSettings;
    }

    public String getCrearor() {
        return crearor;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean applicationExecute(ApplicationBase applicationBase) {
            if (applicationBase.getApplications().contains(this)) {
                System.out.println("Application started.");
                return true;
        } return false;
    }

    @Override
    public boolean applicationConfigure(ApplicationBase applicationBase) {
        return false;
    }


}
