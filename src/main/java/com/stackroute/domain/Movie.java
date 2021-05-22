package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    private Actor actor1;

    public Movie() {
    }

    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

    public Movie(Actor actor2) {
        this.actor1 = actor2;
    }
    public void displayActorDetails()
    {
        System.out.println(this.actor1.getName()+ " "+ this.actor1.getGender()+ " "+ this.actor1.getAge());
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory: "+beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanName: "+ s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext: "+applicationContext);
    }
}
