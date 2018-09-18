package com.qiliang.c_inject.d_scope;

public class MyBeanFactory {

    public UserService createService() {
        return new UserServiceImpl();
    }
}
