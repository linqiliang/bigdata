package com.qiliang.d_aop.e_aspect.a_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


public class MyAspect {

    public void myBefore(JoinPoint joinPoint) {
        System.out.println("before ------AspectJ"+joinPoint.getSignature().getName());
    }

    public void myAfterReturning(JoinPoint joinPoint, Object ret) {
        System.out.println("After Return  ------AspectJ"+joinPoint.getSignature().getName());
    }

    public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("Around before");
        Object obj = joinPoint.proceed();
        System.out.println("Around After");
        return obj;
    }

    public void myAfterThrowing(JoinPoint joinPoint,Throwable e) {
        System.out.println("Throwing: ------" +joinPoint.getSignature().getName() + e.getMessage());
    }

    public void myAfter(JoinPoint joinPoint) {
        System.out.println("My After: ------" +joinPoint.getSignature().getName());
    }
}
