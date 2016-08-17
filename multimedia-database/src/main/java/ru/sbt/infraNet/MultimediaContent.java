package ru.sbt.infraNet;

import java.net.URL;

public interface MultimediaContent {
    URL createObject(String source);

    URL viewObject(String source);

    boolean removeObject(String source);
}
