package com.qiliang.d_aop.a_proxy.b_cglib;

import com.qiliang.d_aop.a_proxy.a_jdk.UserService;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import sun.jvm.hotspot.oops.ObjectHeap;

import java.lang.reflect.Method;

public class myBeanFactory  {

    public static UserServiceImpl createService() {

        final UserServiceImpl userService = new UserServiceImpl();

        final MyAspect myAspect = new MyAspect();

        //UserServiceImpl proxyUserServiceImpl = null;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(userService.getClass());

        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
                    throws Throwable {
                myAspect.before();
                Object obj = method.invoke(userService,objects);
                methodProxy.invokeSuper(o,objects);
                myAspect.after();
                return obj;
            }
        });

        UserServiceImpl proxyService = (UserServiceImpl) enhancer.create();
        return proxyService;
    }

}
