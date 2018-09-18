package com.qiliang.c_inject.c_factory;

public class MyBeanFactory {

    public  UserService createService() {
        return new UserServiceImpl();
    }
}
