package ru.kpfu.itis.lpgallery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kpfu.itis.lpgallery.services.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/authors")
    public String getAuthorsPage(ModelMap map) {
//        map.put("authors", userService.getAllUsers());
        return "authors";
    }
}
