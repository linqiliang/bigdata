package com.qiliang.c_inject.d_scope;

public class UserServiceImpl implements UserService {

    @Override
    public void addUser() {
        System.out.println("c_factory add user");
    }
}