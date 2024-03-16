package com.treug.aoppoint.aspects;

public class MyPointcut {

    @Pointcut("execution(* add*())")
    public void allAddMethod(){
    }

}
