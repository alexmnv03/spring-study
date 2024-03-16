package com.treug.aoporderaspect.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class SecurityAspect {

    @Before("com.treug.aoporderaspect.aspects.MyPointcut.allGetMethod())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: Попытка получить книгу/журнал");
    }

    @Before("com.treug.aoporderaspect.aspects.MyPointcut.allGetMethod())")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение");
    }

}
