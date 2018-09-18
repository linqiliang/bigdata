package com.qiliang.d_aop.e_aspect.a_xml;

public class MyBeanFactory {

    public UserService createService() {
        return new UserServiceImpl();
    }
}
