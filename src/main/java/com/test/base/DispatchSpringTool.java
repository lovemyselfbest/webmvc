package com.test.base;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DispatchSpringTool implements ApplicationContextAware {


    private static ApplicationContext staticApplicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        staticApplicationContext = applicationContext;
    }


    public static Object getBean(Class<?> cls){
        return staticApplicationContext.getBean(cls);
    }
}
