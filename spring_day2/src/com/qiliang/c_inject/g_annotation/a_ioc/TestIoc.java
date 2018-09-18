package com.qiliang.c_inject.g_annotation.a_ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestIoc {

    @Test
    public void demo01(){
        UserService userService = new UserServiceImpl();
        userService.addUser();
    }

    @Test
    public void demo2() {
        String xmlPath = "com/qiliang/c_inject/g_annotation/a_ioc/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        UserService userService = (UserService)applicationContext.getBean("userServiceID");

        userService.addUser();
    }
}
