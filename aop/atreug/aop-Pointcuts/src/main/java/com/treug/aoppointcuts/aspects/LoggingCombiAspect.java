package com.treug.aoppointcuts.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingCombiAspect {

  @Pointcut("execution(* com.treug.aoppointcuts.lib.get*())")
  private void getAllMethods(){
  }

  @Before("getAllMethods()")
  public void beforeGetAllAdvice(){
    System.out.println("beforeGetAllAdvice: Попытка получить ? ");
  }

  @Pointcut("execution(* com.treug.aoppointcuts.lib.return*())")
  private void returnAllMethods(){  }

  @Before("returnAllMethods()")
  public void beforeReturnAllAdvice(){
    System.out.println("beforeReturnAllAdvice: Попытка вернуть ? ");
  }

  @Pointcut("getAllMethods() || returnAllMethods()")
  public void allGetOrReturnAllAdvice(){
  }

  @Before("allGetOrReturnAllAdvice()")
  private void beforeGetOrReturnAllAdvice(){
    System.out.println("beforeGetOrReturnAllAdvice: Попытка получить ? ");
  }

  @Pointcut("execution(* com.treug.aoppointcuts.lib.*(..))")
  private void allMethodsFromLibrary(){
  }

  @Pointcut("execution(public void com.treug.aoppointcuts.lib.returnMagazine())")
  private void pvreturnMagazine(){
  }

  @Pointcut("allMethodsFromLibrary() && !pvreturnMagazine()")
  public void allMethodsExceptFromLibrary(){
  }

  @Before("allMethodsExceptFromLibrary()")
  public void beforeAllMethodsExceptFromLibrary(){
    System.out.println("beforeAllMethodsExceptFromLibrary: log finish ");
  }


}
