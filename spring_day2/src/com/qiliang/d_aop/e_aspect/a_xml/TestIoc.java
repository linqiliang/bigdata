package com.qiliang.d_aop.e_aspect.a_xml;

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

        MyBeanFactory myBeanFactory = new MyBeanFactory();
        UserService userService =  myBeanFactory.createService();

        userService.addUser();
    }
    @Test
    public void demo04() {

             String xmlPath = "com/qiliang/d_aop/e_aspect/a_xml/applicationContext.xml";
             ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

             UserService userService = (UserService)applicationContext.getBean("userServiceID");
             userService.addUser();
             userService.deleteUser();

    }
}
