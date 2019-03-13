package com.spring.orm.UserLogin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

//指定单元测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//指定配置文件路径
@ContextConfiguration(locations = {"/applicationContext.xml"})/*指定配置文件位置*/
public class UserLoginTest {
    //自动注入max
    @Autowired
    private User user;

    @Autowired
    private UserLogin userLogin;

    @Test
    public void userLogin() {

        assertEquals(true, userLogin.userLogin(user));
    }
}