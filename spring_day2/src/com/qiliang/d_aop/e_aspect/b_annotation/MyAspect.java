package com.qiliang.d_aop.e_aspect.b_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MyAspect {


    final private String pintStr = "execution(* com.qiliang.d_aop.e_aspect.b_annotation.UserServiceImpl.*())";
    @Before("execution(* com.qiliang.d_aop.e_aspect.b_annotation.UserServiceImpl.*())")
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("before ------AspectJ"+joinPoint.getSignature().getName());
    }

    @Pointcut("execution(* com.qiliang.d_aop.e_aspect.b_annotation.UserServiceImpl.*())")
    private void myPointCut1(){

    }

    @AfterReturning(value = pintStr ,returning = "ret")
    public void myAfterReturning(JoinPoint joinPoint, Object ret) {
        System.out.println("After Return  ------AspectJ"+joinPoint.getSignature().getName());
    }

    @Around(pintStr)
    public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("Around before");
        Object obj = joinPoint.proceed();
        System.out.println("Around After");
        return obj;
    }

    @AfterThrowing(value = pintStr,throwing = "e")
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e) {
        System.out.println("Throwing: ------" +joinPoint.getSignature().getName() + e.getMessage());
    }

    @After(value = pintStr)
    public void myAfter(JoinPoint joinPoint) {
        System.out.println("My After: ------" +joinPoint.getSignature().getName());
    }
}
