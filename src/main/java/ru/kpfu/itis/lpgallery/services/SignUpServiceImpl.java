package ru.kpfu.itis.lpgallery.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.lpgallery.dto.SignUpDto;
import ru.kpfu.itis.lpgallery.models.User;
import ru.kpfu.itis.lpgallery.repositories.UserRepository;

import java.util.Arrays;

@Component
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void signUp(SignUpDto form) {
        System.out.println(form);
        User user = User.builder()
                .nickname(form.getNickname())
                .email(form.getEmail())
                .hashPassword(passwordEncoder.encode(form.getPassword()))
                .roles(Arrays.asList(form.getRole()))
                .build();
        userRepository.save(user);
    }
}
