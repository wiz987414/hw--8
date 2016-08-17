package ru.sbt.infraNet;

/**
 * Created by belyakov on 17.08.2016.
 */
public interface ServicesProvider extends AuthentificationService,
        AuthorisationService,
        FriendsListManageService,
        GiftsService,
        ProfileViewService,
        ContentManageService,
        ApplicationsService,
        TalkingService{
    void getServicesParemeters();
}
