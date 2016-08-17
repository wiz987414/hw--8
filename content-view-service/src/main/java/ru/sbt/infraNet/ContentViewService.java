package ru.sbt.infraNet;

public interface ContentViewService extends AuthentificationService {
    MultimediaContent findMultimedia(ContentServerImpl contentServerImpl);
}
