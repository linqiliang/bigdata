package com.qiliang.b_di;

import com.qiliang.a_ioc.UserService;
import com.qiliang.a_ioc.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class TestIoc {


    @Test
    public void demo2() {
        String xmlPath = "com/qiliang/b_di/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        BookService bookService = (BookService)applicationContext.getBean("bookService");
        bookService.addBook();
    }

    @Test
    public void demo3() {
        String xmlPath = "com/qiliang/b_di/applicationContext.xml";
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(xmlPath));

        BookService bookService = (BookService) beanFactory.getBean("bookService");

        bookService.addBook();
    }
}
