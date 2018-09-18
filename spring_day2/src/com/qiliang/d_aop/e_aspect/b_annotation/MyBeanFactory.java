package com.qiliang.d_aop.e_aspect.b_annotation;

public class MyBeanFactory {

    public UserService createService() {
        return new UserServiceImpl();
    }
}
