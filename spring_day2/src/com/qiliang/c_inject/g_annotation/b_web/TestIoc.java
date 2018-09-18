package com.qiliang.c_inject.g_annotation.b_web;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestIoc {


    @Test
    public void demo2() {
        String xmlPath = "com/qiliang/c_inject/g_annotation/b_web/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        StudentAction userService = (StudentAction) applicationContext.getBean("studentActionID");

        userService.excute();
    }

}
