package ru.kpfu.itis.lpgallery.extensions.pebble;

import com.mitchellbosecke.pebble.extension.Function;
import com.mitchellbosecke.pebble.template.EvaluationContext;
import com.mitchellbosecke.pebble.template.PebbleTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import java.util.*;


@Component
public class FullUriFunction implements Function {


    @Autowired
    private ServletContext servletContext;

    @Override
    public Object execute(Map<String, Object> map, PebbleTemplate pebbleTemplate, EvaluationContext evaluationContext,
                          int i) {
        String input = (String)map.get("uri");
        StringBuilder fullUri = new StringBuilder(input);
        fullUri.insert(0, servletContext.getContextPath());
        return fullUri.toString();
    }

    @Override
    public List<String> getArgumentNames() {
        return Arrays.asList("uri");
    }
}
