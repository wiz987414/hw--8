package ru.sbt.infraNet;

public class MoblieClientImpl implements MobileClient {
    private final ServicesProviderImpl clientProvider;
    private final ContentServerImpl clientContentAccess;
    private final AccountServerImpl clientAccountAccess;

    public MoblieClientImpl(ServicesProviderImpl clientProvider,
                            ContentServerImpl clientContentAccess,
                            AccountServerImpl clientAccountAccess) {
        this.clientProvider = clientProvider;
        this.clientContentAccess = clientContentAccess;
        this.clientAccountAccess = clientAccountAccess;
    }

    @Override
    public void buildUserInterface(ContentServer contentServer) {

    }
}
