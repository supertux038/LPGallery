package ru.kpfu.itis.lpgallery.extensions.pebble;

import com.mitchellbosecke.pebble.extension.Function;
import com.mitchellbosecke.pebble.template.EvaluationContext;
import com.mitchellbosecke.pebble.template.PebbleTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class UserAvatarUriFunction implements Function {

    @Override
    public Object execute(Map<String, Object> map, PebbleTemplate pebbleTemplate, EvaluationContext evaluationContext, int i) {
        String input = (String) map.get("userAvatarUri");
        StringBuilder userDataUri = new StringBuilder(input);
        userDataUri.insert(0,"/user-data/images/avatars/");
        return userDataUri.toString();
    }

    @Override
    public List<String> getArgumentNames() {
        List<String> names = new ArrayList<>();
        names.add("userAvatarUri");
        return names;
    }

}
