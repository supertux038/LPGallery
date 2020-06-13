//package ru.kpfu.itis.lpgallery.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import ru.kpfu.itis.lpgallery.dto.SignInDto;
//import ru.kpfu.itis.lpgallery.models.User;
//import ru.kpfu.itis.lpgallery.repositories.UserRepository;
//
//@Service
//public class SignInServiceImpl implements SignInService {
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Override
//    public void signIn(SignInDto form) {
//        User user = User.builder()
//                .nickname(form.getNickname())
//                .password(form.getPassword())
//                .build();
//        User dbUser = userRepository.findByNickname(form.getNickname());
//        if (user.equals(dbUser)) {
//
//        }
//    }
//}
