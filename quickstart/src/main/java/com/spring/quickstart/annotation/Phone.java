package com.spring.quickstart.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by SHIGAUNG on 2019/2/28.
 * <p>
 * 采用注解和Lombok开发的Phone类
 */
@Component
@Data   /*get,set,toString不用写了*/
public class Phone {
    @Value("iPhoneX")
    private String brand;

    @Value("8888.88")
    private double price;

}
