package com.qiliang.c_inject.e_lifecycle;

public class UserServiceImpl implements UserService {

    @Override
    public void addUser() {
        System.out.println("c_factory add user");
    }

    public void myInit() { System.out.println("my init");}

    public void myDestroy() {System.out.println("my Destroy"); }
}