package ru.kpfu.itis.lpgallery.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kpfu.itis.lpgallery.models.Model;

@Controller
public class ModelController {

    @GetMapping("/model-page")
    public String getModelPage(ModelMap map) {
        Model model = new Model();
        model.setName("AE 86");
        return "model-page";
    }

    @GetMapping("/addModel")
    public String getAddModelPage() {
        return "add-model";
    }
}
