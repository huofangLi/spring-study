package com.spring.orm.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/aop.xml"})
public class HelloTest {

    @Autowired
    private Hello hello;

    @Test
    public void getHello() {
        hello.getHello();
    }
}