package com.qiliang.c_inject.e_lifecycle;

public class MyBeanFactory {

    public UserService createService() {
        return new UserServiceImpl();
    }
}
