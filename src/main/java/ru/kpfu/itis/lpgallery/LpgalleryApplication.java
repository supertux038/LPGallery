package ru.kpfu.itis.lpgallery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ru.kpfu.itis.lpgallery")
public class LpgalleryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LpgalleryApplication.class, args);
    }

}
