package ru.kpfu.itis.lpgallery.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

    @GetMapping("/main")
    public String getMainPage(ModelMap map) {
        map.put("title", "Main");
        map.put("textTitle", "Test text by admin");
        map.put("text", "Lorem ipsum dolor sit amet, consectetur.");
        map.put("admin", true);
        return "main";
    }

}
