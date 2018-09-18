package com.rcnjtech.action;



public class HelloAction {

    public String sayHello() {
        /**
         * 必须是pubulic
         */
        System.out.println("Say hello");
        return "success";
    }
}
