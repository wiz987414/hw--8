package ru.sbt.infraNet;

public interface Application {

    boolean applicationExecute(ApplicationBase applicationBase);

    boolean applicationConfigure(ApplicationBase applicationBase);
}
