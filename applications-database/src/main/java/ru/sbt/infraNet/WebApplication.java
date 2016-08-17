package ru.sbt.infraNet;

public class WebApplication implements Application {
    @Override
    public boolean applicationExecute(ApplicationBase applicationBase) {
        return false;
    }

    @Override
    public boolean applicationConfigure(ApplicationBase applicationBase) {
        return false;
    }
}
