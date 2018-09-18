package com.qiliang.c_inject.f_xml.d_spel;

import com.qiliang.c_inject.f_xml.c_p.Person;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetter {

    @Test
    public void demo04() {

        String xmlPath = "com/qiliang/c_inject/f_xml/d_spel/applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        Customer customer = (Customer)applicationContext.getBean("customerID");
        System.out.println(customer);
    }

}
