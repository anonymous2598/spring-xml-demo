package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements DisposableBean, InitializingBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("overridden Destroy from DisposableBean Interface called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("overridden afterPropertiesSet from InitializingBean called");
    }

    public void customInit()
    {
        System.out.println("CustomInit called");
    }
    public void customDestroy()
    {
        System.out.println("CustomDestroy called");
    }
}
