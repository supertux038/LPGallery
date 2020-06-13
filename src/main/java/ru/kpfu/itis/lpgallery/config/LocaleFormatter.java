package ru.kpfu.itis.lpgallery.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class LocaleFormatter implements Formatter<String> {

    @Autowired
    private MessageSource messageSource;

    @Override
    public String parse(String s, Locale locale) throws ParseException {
        return s;
    }

    @Override
    public String print(String string, Locale locale) {
        return messageSource.getMessage(string,null,locale);
    }
}
