package com.treug.aoppointcuts.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

  @Before("execution(public void getBook())")
  public void beforeGetBookAdvice(){
    System.out.println("beforeGetBookAdvice: Попытка получить книгу");
  }

  @Before("execution(public void com.treug.aoppointcuts.lib.UniLibrary.getBook())")
  public void beforeUniGetBookAdvice(){
    System.out.println("beforeGetBookAdvice: Only Uni Попытка получить книгу");
  }

}
