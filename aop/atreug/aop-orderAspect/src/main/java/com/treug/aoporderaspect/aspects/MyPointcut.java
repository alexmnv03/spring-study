package com.treug.aoporderaspect.aspects;

public class MyPointcut {

    @Pointcut("execution(* get*())")
    public void allGetMethod(){
    }

}
