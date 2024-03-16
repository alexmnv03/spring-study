package com.treug.aoppoint.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcut {

    @Pointcut("execution(* add*())")
    public void allAddMethod(){
    }

}
