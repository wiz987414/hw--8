package ru.sbt.infraNet;

public class MultimediaWall {
    private final MultimediaBase wallMultimedis;
    private final TalkingBase wallTaling;

    public MultimediaWall(MultimediaBase wallMultimedis,
                          TalkingBase wallTaling) {
        this.wallMultimedis = wallMultimedis;
        this.wallTaling = wallTaling;
    }
}
