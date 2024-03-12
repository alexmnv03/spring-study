package com.treug.aoppointcuts.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

  @Pointcut("allGetMethod())")
  public void beforeGetBookAdvice(){
    System.out.println("beforeGetBookAdvice: Попытка получить книгу/журнал");
  }

  @Pointcut("allGetMethod())")
  public void beforeGetSecurityAdvice(){
    System.out.println("beforeGetSecurityAdvice: проверка прав на получение");
  }

  @Pointcut("execution(* get*())")
  private void allGetMethod() { }

}
