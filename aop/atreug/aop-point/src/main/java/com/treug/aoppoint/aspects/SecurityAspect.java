package com.treug.aoppoint.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class SecurityAspect {

    @Before("com.treug.aoporderaspect.aspects.MyPointcut.allAddMethod())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: Попытка получить книгу/журнал");
    }

    @Before("com.treug.aoporderaspect.aspects.MyPointcut.allAddMethod())")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение");
    }

}
