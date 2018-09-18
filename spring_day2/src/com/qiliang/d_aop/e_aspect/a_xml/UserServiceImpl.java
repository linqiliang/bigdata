package com.qiliang.d_aop.e_aspect.a_xml;

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