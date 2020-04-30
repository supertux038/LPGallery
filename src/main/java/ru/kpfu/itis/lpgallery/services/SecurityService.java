package ru.kpfu.itis.lpgallery.services;

public interface SecurityService {
    String findLoggedInNickname();

    void autoLogin(String nickname, String password);
}
