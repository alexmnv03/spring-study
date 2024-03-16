package com.treug.aoporderaspect.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class ExeptionHandlingAspect {

    @Before("com.treug.aoporderaspect.aspects.MyPointcut.allGetMethod())")
    public void beforeGetExeptionHandlingAspect(){
        System.out.println("beforeGetExeptionHandlingAspect: Ловим исключения при Попытка получить книгу/журнал");
    }


}
