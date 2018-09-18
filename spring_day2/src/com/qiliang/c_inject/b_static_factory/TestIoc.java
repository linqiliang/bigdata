package com.qiliang.c_inject.b_static_factory;

import com.qiliang.c_inject.b_static_factory.UserService;
import com.qiliang.c_inject.b_static_factory.UserServiceImpl;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestIoc {

 //  @Test
 //  public void demo01(){
 //      UserService userService = new UserServiceImpl();
 //      userService.addUser();
 //  }

 //  @Test
 //  public void demo2() {
 //      String xmlPath = "com/qiliang/a_ioc/applicationContext.xml";
 //      ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

 //      UserService userService = (UserService)applicationContext.getBean("userServiceID");


 //  }
    @Test
    public void demo03() {

        UserService userService = MyBeanFactory.createService();
        userService.addUser();
    }
    @Test
    public void demo04() {

             String xmlPath = "com/qiliang/c_inject/b_static_factory/applicationContext.xml";
             ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

             UserService userService = (UserService)applicationContext.getBean("userServiceID");
             userService.addUser();

    }
}
