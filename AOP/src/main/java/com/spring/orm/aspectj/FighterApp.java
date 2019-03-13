package com.spring.orm.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FighterApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        Tiger tiger = context.getBean(Tiger.class);
        tiger.walk();
    }
}
