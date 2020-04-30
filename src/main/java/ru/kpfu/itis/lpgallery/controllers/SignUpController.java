package ru.kpfu.itis.lpgallery.controllers;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.kpfu.itis.lpgallery.dto.SignUpDto;
import ru.kpfu.itis.lpgallery.services.SignUpService;

@Controller
public class SignUpController {

    @Autowired
    private SignUpService service;

    @GetMapping("/signUp")
    public String getSignUpPage(Authentication authentication) {
        if (authentication != null) {
            return "redirect:/main";
        } else {
            return "sign-up";
        }
    }

    @PostMapping("/signUp")
    @PreAuthorize("isAnonymous()")
    public String signUp(SignUpDto form) {
        service.signUp(form);
        return "redirect:/signIn";
    }
}
