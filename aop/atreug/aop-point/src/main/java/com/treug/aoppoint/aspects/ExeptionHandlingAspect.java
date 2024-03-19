package com.treug.aoppoint.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class ExeptionHandlingAspect {

    @Before("com.treug.aoppoint.aspects.MyPointcut.allAddMethod())")
    public void beforeGetExeptionHandlingAspect(){
        System.out.println("beforeAddExeptionHandlingAspect: Ловим исключения при Попытка получить книгу/журнал");
    }


}
