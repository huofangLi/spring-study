package com.spring.quickstart.annotation;

import org.springframework.stereotype.Component;

/**
 * Created by SHIGAUNG on 2019/2/28.
 * <p>
 * 采用注解开发的bean
 * @Component 用于类级别注解，标注本类为一个可被Spring容器托管的bean
 */
@Component("hello")
public class Hello {
    public String getHello() {
        return "Hello World!";
    }
}
