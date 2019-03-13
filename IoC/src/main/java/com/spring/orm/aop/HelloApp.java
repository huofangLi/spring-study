package com.spring.orm.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/aop.xml");
        Hello hello = context.getBean(Hello.class);
        System.out.println(hello.getHello());
    }
}