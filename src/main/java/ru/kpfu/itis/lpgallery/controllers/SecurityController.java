package ru.kpfu.itis.lpgallery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.kpfu.itis.lpgallery.dto.SignInDto;
import ru.kpfu.itis.lpgallery.dto.SignUpDto;
import ru.kpfu.itis.lpgallery.services.SignInService;
import ru.kpfu.itis.lpgallery.services.SignUpService;

import javax.validation.Valid;

@Controller
public class SecurityController {

    @Autowired
    private SignUpService signUpService;

    @GetMapping("/login")
    public String getSignInPage() {
        return "login";
    }


    @GetMapping("/signUp")
    public String getSignUpPage(Model model) {
        model.addAttribute("form", new SignUpDto());
        return "sign-up";
    }

    @PostMapping("/signUp")
    @PreAuthorize("isAnonymous()")
    public String signUp(@Valid @ModelAttribute("form") SignUpDto form, BindingResult bindingResult,
                         Model model) {
        System.out.println("in sign up post method");
        if (!bindingResult.hasErrors()) {
            signUpService.signUp(form);
            return "redirect:/main";
        } else {
            model.addAttribute("form", form);
            return "sign-up";
        }
    }

    @GetMapping("/accessDenied")
    public String getError403Page(){
        return "403";
    }


}
