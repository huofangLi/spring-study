package com.spring.orm.aop;

/*用户自定义的前置增强类*/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyBeforeAdvice {
    private static final Logger logger = LoggerFactory.getLogger(MyBeforeAdvice.class);

    //    定义前置方法
    public void beforeMethod() {
//        logger.debug("This is a before method by huofang");
        logger.info("连接数据库...");
    }


}
