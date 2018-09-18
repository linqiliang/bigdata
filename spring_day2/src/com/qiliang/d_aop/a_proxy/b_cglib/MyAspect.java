package com.qiliang.d_aop.a_proxy.b_cglib;

public class MyAspect {

    public void before() {
        System.out.println("Before Test add data cg_lib");
    }

    public void after() {
        System.out.println("After Test add data cg_lib");
    }
}
