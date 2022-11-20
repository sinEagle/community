package com.sineagle.community.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

// 这只是一个示例

//@Component
//@Aspect
public class AlphaAspect {
    @Pointcut("execution(* com.sineagle.community.service.*.* (..))")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void before() {
        System.out.println("before ! ! ");
    }
    @After("pointcut()")
    public void after() {
        System.out.println("after ! ! ");
    }
    @AfterReturning("pointcut()")
    public void afterReturning() {
        System.out.println("afterReturn ! ! ");
    }
    @AfterThrowing("pointcut()")
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("=== around before");
        Object obj = joinPoint.proceed();
        System.out.println("=== around after");
        return obj;
    }

}
