package ru.kpfu.itis.lpgallery.services;

import ru.kpfu.itis.lpgallery.models.User;

import java.util.List;

public interface UserService {
    void save(User user);

    List<User> getAllUsers();

    User findByNickname(String nickname);
}
