package ru.kpfu.itis.lpgallery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MessageController {

    private MessageSourceAccessor msa;

    @Autowired
    private void setMessageSourceAccessor(@Qualifier("messageSource") MessageSource ms){
        this.msa = new MessageSourceAccessor(ms);
    }

    @GetMapping("/international")
    public String getInternationalPage(ModelMap map) {
        map.put("greeting", this.msa.getMessage("greeting"));
        return "international";
    }

}
