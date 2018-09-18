package com.qiliang.c_inject.f_xml.b_setter;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetter {

    @Test
    public void demo04() {

        String xmlPath = "com/qiliang/c_inject/f_xml/b_setter/applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        Person person = (Person)applicationContext.getBean("personID");
        System.out.println(person);



    }

}
