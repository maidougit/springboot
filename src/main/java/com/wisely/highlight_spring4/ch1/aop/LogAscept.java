package com.wisely.highlight_spring4.ch1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by maido on 2017/2/2.
 */
@Aspect
@Component
public class LogAscept {
    @Pointcut("@annotation(com.wisely.highlight_spring4.ch1.aop.Action)")
    public void annotionPointCut(){}

    @After("annotionPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method  method  = methodSignature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截 " + action.name());
    }

    @Before("execution(* com.wisely.highlight_spring4.ch1.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
       MethodSignature signature = (MethodSignature)joinPoint.getSignature();
       Method method = signature.getMethod();
        System.out.println("方法式拦截 " + method.getName());
    }
}

