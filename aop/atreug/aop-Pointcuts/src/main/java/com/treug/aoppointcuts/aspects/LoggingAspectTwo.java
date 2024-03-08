package com.treug.aoppointcuts.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspectTwo {

  @Before("execution(public void getBook(String))")
  public void beforeGetBookAdvice(){
    System.out.println("beforeGetBookAdvice: Попытка получить книгу");
  }

  @Before("execution(public void *(*))")
  public void beforeGetAnyAdvice(){
    System.out.println("beforeGetAnyAdvice: Попытка получить книгу");
  }

  @Before("execution(public void *(..))")
  public void beforeGetAnyManyAdvice(){
    System.out.println("beforeGetAnyManyAdvice: Попытка получить книгу");
  }

  @Before("execution(public void getBook(com.treug.aoppointcuts.lib.Book))")
  public void beforeGetParamBookAdvice(){
    System.out.println("beforeGetBookAdvice: Попытка получить книгу");
  }

  @Before("execution(public void getBook(com.treug.aoppointcuts.lib.Book, ..))")
  public void beforeGetParamBookAndAnyAdvice(){
    System.out.println("beforeGetBookAdvice: Попытка получить книгу");
  }

}
