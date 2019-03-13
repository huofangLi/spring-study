package com.spring.orm.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloImpl implements Hello {
    private static final Logger logger = LoggerFactory.getLogger(MyBeforeAdvice.class);

    @Override
    public void getHello() {
//        return "Hello,Spring AOP";
        logger.info("开始进行插入操作。。");
    }
}
