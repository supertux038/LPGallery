package ru.kpfu.itis.lpgallery.extensions.pebble;

import com.mitchellbosecke.pebble.extension.AbstractExtension;
import com.mitchellbosecke.pebble.extension.Function;
import com.mitchellbosecke.pebble.spring.extension.SpringExtension;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

import java.util.Map;

public class CustomExtension extends SpringExtension implements BeanFactoryAware {
    private BeanFactory beanFactory;

    @Override
    public Map<String, Function> getFunctions() {
        Map<String, Function> functions = super.getFunctions();
        functions.put("fullUri", beanFactory.getBean(FullUriFunction.class));
        functions.put("userDataUri", beanFactory.getBean(UserDataUriFunction.class));
        functions.put("userAvatarUri", beanFactory.getBean(UserAvatarUriFunction.class));
        return functions;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}
