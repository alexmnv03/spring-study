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

  @Before("execution(public void get*())")
  public void beforeGetAnyAdvice(){
    System.out.println("beforeGetAnyAdvice: Попытка получить книгу");
  }

  @Before("execution(public void returnBook())")
  public void beforeReturnBookAdvice(){
    System.out.println("beforeReturnBookAdvice: Попытка вернуть книгу");
  }

  @Before("execution(public void *())")
  public void beforeAnyAdvice(){
    System.out.println("beforeGetAnyAdvice: Попытка что-нить чего-нить");
  }

  @Before("execution(public * returnBook())")
  public void beforeAnyReturnBookAdvice(){
    System.out.println("beforeReturnBookAdvice: Попытка вернуть книгу");
  }

  @Before("execution(* returnBook())")
  public void beforeAllReturnBookAdvice(){
    System.out.println("beforeAllReturnBookAdvice: Попытка вернуть книгу");
  }

  @Before("execution(* *())")
  public void beforeAllAdvice(){
    System.out.println("beforeAllAdvice: Попытка вернуть книгу");
  }


}
