package com.treug.aoppointcuts.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspectAdvert {

  @Before("execution(public void getBook())")
  public void beforeGetBookAdvice(){
    System.out.println("beforeGetBookAdvice: Попытка получить книгу");
  }

}
