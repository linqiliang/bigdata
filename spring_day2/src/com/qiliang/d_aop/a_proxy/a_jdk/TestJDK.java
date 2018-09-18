package com.qiliang.d_aop.a_proxy.a_jdk;

import org.junit.Test;

public class TestJDK {

    @Test
    public void demo1() {
        myBeanFactory c_myBeanFactory = new myBeanFactory();
        UserService userService = (UserService)c_myBeanFactory.createService();
        userService.addUser();
    }
}
