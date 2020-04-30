package ru.kpfu.itis.lpgallery.config.viewresolver;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.loader.Loader;
import com.mitchellbosecke.pebble.loader.ServletLoader;
import com.mitchellbosecke.pebble.spring.extension.SpringExtension;
import com.mitchellbosecke.pebble.spring.servlet.PebbleViewResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import ru.kpfu.itis.lpgallery.extensions.pebble.CustomExtension;

import javax.servlet.ServletContext;

@Configuration
public class PebbleViewResolverConfig {

    @Autowired
    private ServletContext servletContext;

    @Bean
    public PebbleViewResolver viewResolver() {
        PebbleViewResolver viewResolver = new PebbleViewResolver();
        viewResolver.setPebbleEngine(pebbleEngine());
        return viewResolver;
    }

    @Bean
    public PebbleEngine pebbleEngine(){
        return new PebbleEngine.Builder().loader(pebbleTemplateLoader()).extension(pebbleExtension()).build();
    }

    @Bean
    public Loader<?> pebbleTemplateLoader(){
        return new ServletLoader(servletContext);
    }

    @Bean
    public SpringExtension pebbleExtension(){
        return new CustomExtension();
    }

}
