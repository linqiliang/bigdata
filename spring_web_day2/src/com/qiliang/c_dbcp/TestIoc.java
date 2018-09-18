package com.qiliang.c_dbcp;

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
    public void demo04() {


             User user = new User();
             user.setId(1);
             user.setUsername("jk");
             user.setPw("998");


             String xmlPath = "com/qiliang/c_dbcp/applicationContext.xml";
             ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);


             UserDao userDao = (UserDao)applicationContext.getBean("userDaoId");
             userDao.update(user);


    }
}
