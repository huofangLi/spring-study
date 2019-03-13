package com.spring.orm.aop;

public class HelloImpl implements Hello {
    @Override
    public String getHello() {
        return "Hello,Spring AOP";
    }
}
