package ru.kpfu.itis.lpgallery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.kpfu.itis.lpgallery.dto.SignInDto;
import ru.kpfu.itis.lpgallery.services.SignInService;

@Controller
public class LoginController {
    @Autowired
    private SignInService signInService;

    @GetMapping("/login")
    public String getSignInPage() {
        return "login";
    }


}
