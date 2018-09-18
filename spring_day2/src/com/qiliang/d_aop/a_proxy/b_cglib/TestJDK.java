package com.qiliang.d_aop.a_proxy.b_cglib;

import org.junit.Test;

public class TestJDK {

    @Test
    public void demo1() {
        myBeanFactory c_myBeanFactory = new myBeanFactory();
        UserServiceImpl userService = (UserServiceImpl)c_myBeanFactory.createService();
        userService.addUser();
        userService.delUser();
        userService.updateUser();
    }
}
