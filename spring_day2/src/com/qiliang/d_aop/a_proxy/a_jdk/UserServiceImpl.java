package com.qiliang.d_aop.a_proxy.a_jdk;

public class UserServiceImpl implements UserService {

    @Override
    public void addUser() {
        System.out.println("add User");
    }

}
