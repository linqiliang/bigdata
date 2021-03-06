package com.qiliang.c_inject.c_factory;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable{

        System.out.println("前------");

        Object obj = methodInvocation.proceed();

        System.out.println("后------");

        return obj;

    }
}
