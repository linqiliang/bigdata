package com.qiliang.d_aop.a_proxy.a_jdk;

public class MyAspect {

    public void before() {
        System.out.println("Before Test add data jdk");
    }

    public void after() {
        System.out.println("After Test add data jdk");
    }
}
