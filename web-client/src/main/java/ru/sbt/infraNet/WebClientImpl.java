package ru.sbt.infraNet;

public class WebClientImpl implements WebClient {
    private final ServicesProviderImpl clientProvider;
    private final ContentServerImpl clientContentAccess;
    private final AccountServerImpl clientAccountAccess;

    public WebClientImpl(ServicesProviderImpl clientProvider,
                         ContentServerImpl clientContentAccess,
                         AccountServerImpl clientAccountAccess) {
        this.clientProvider = clientProvider;
        this.clientContentAccess = clientContentAccess;
        this.clientAccountAccess = clientAccountAccess;
    }

    @Override
    public Object getMobileOSParameters() {
        return null;
    }
}
