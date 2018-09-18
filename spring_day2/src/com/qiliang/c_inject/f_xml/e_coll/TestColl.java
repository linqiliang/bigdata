package com.qiliang.c_inject.f_xml.e_coll;

import com.qiliang.c_inject.f_xml.e_coll.CollData;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestColl {

    @Test
    public void demo04() {
    String xmlPath = "com/qiliang/c_inject/f_xml/e_coll/applicationContext.xml";
    ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

    CollData customer = (CollData) applicationContext.getBean("customerID");
    System.out.println(customer);
}
}

