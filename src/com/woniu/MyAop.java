package com.woniu;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MyAop {

    //用来定义切入点表达式的方法,方法名就是切入点表达式的名称
    @Pointcut("execution(* com.woniu.service..*.*(..))")
    public void pt1(){ }

    @Before("pt1()")
    public void Before() throws Throwable {
        System.out.println("before aop...");
    }
}
