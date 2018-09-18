package com.qiliang.f_properties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestIoc {


    @Test
    public void demo04() {
             User user = new User();
             user.setId(1);
             user.setUsername("jk");
             user.setPw("9008");
             String xmlPath = "com/qiliang/f_properties/applicationContext.xml";
             ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
             UserDao userDao = (UserDao)applicationContext.getBean("userDaoId");
             userDao.update(user);
    }
}
