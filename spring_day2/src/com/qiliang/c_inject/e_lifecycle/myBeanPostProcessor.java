package com.qiliang.c_inject.e_lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.stream.StreamSupport;

public class myBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("PostBefore"+s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("PostAfter"+s);
        return Proxy.newProxyInstance(myBeanPostProcessor.class.getClassLoader(), o.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("====== 开启事务");
                        Object obj = method.invoke(o,args);
                        System.out.println("====== 关闭事务");
                        return null;
                    }
                });
    }
}
