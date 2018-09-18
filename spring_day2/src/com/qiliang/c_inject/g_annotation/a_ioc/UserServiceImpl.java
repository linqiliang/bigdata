package com.qiliang.c_inject.g_annotation.a_ioc;


import org.springframework.stereotype.Component;

@Component("userServiceID")
public class UserServiceImpl implements UserService {

    @Override
    public void addUser() {
        System.out.println("a_ioc add user");
    }
}