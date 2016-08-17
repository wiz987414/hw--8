package ru.sbt.infraNet;

import java.net.URL;

public class Movie implements MultimediaContent {
    @Override
    public URL createObject(String source) {
        return null;
    }

    @Override
    public URL viewObject(String source) {
        return null;
    }

    @Override
    public boolean removeObject(String source) {
        return false;
    }
}
