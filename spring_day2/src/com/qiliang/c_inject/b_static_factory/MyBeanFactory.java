package com.qiliang.c_inject.b_static_factory;

public class MyBeanFactory {

    public static UserService createService() {
        return new UserServiceImpl();
    }
}
