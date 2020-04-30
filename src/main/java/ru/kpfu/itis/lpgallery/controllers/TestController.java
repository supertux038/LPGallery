package ru.kpfu.itis.lpgallery.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test-page")
    public String getTestPage(ModelMap map) {
        return "main";
    }
}
