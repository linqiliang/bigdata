package com.qiliang.d_aop.e_aspect.b_annotation;


import org.springframework.stereotype.Service;

@Service("userServiceID")
public class UserServiceImpl implements UserService {

    @Override
    public void addUser() {
        System.out.println("c_factory add user");
    }

    @Override
    public void deleteUser() {
        System.out.println("xml delete user");
    }
}