package ru.sbt.infraNet;

public class ContentServerImpl implements ContentServer {
    private final ApplicationBase applicationBase;
    private final MultimediaBase multimediaBase;
    private final MultimediaWall multimediaWall;

    public ContentServerImpl(ApplicationBase applicationBase,
                             MultimediaBase multimediaBase,
                             MultimediaWall multimediaWall) {
        this.applicationBase = applicationBase;
        this.multimediaBase = multimediaBase;
        this.multimediaWall = multimediaWall;
    }

    @Override
    public boolean checkServerStatus() {
        return false;
    }

    public ApplicationBase getApplicationBase() {
        return applicationBase;
    }

    public MultimediaBase getMultimediaBase() {
        return multimediaBase;
    }

    public MultimediaWall getMultimediaWall() {
        return multimediaWall;
    }
}
