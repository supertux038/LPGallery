package ru.kpfu.itis.lpgallery.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.lpgallery.dto.SignUpDto;
import ru.kpfu.itis.lpgallery.models.User;
import ru.kpfu.itis.lpgallery.repositories.UserRepository;

@Component
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void signUp(SignUpDto form) {
        User user = User.builder()
                .nickname(form.getNickname())
                .email(form.getEmail())
                .password(form.getPassword())
                .build();
        System.out.println("user is about to be saved");
        userRepository.save(user);
    }
}
