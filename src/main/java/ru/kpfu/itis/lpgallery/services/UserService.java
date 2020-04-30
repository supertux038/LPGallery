package ru.kpfu.itis.lpgallery.services;

import ru.kpfu.itis.lpgallery.models.User;

public interface UserService {
    void save(User user);

    User findByNickname(String nickname);
}
