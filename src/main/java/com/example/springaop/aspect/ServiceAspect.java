package com.example.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {
    @Before("execution(* com.example.springaop.service.MessageService.message(..))")
    public void beforeGiveMessage(JoinPoint joinPoint)
    {
        System.out.println("Parameter captured before send message method"+joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }
    @After("execution(* com.example.springaop.service.MessageService.message(..))")
    public void AfterGiveMessage(JoinPoint joinPoint)
    {
        System.out.println("Parameter captured after send message method"+joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }


}
