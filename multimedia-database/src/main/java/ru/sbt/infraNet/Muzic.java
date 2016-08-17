package ru.sbt.infraNet;

import java.net.URL;

/**
 * Created by Archont on 16.08.2016.
 */
public class Muzic implements MultimediaContent {
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
