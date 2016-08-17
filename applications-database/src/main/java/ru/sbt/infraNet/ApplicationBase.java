package ru.sbt.infraNet;

import java.util.List;

public class ApplicationBase {
    private final List<Application> applications;

    public ApplicationBase(List<Application> applications) {
        this.applications = applications;
    }

    public List<Application> getApplications() {
        return applications;
    }
}
