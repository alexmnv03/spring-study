package com.treug.aopafterreturning.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsAdvice() {
        System.out.println("beforeGetStudentsAdvice: Логируем получение списка студентов перед вызовом метода getStudents");
    }

    @AfterReturning("execution(* getStudents())")
    public void afterReturningGetStudentsAdvice() {
        System.out.println("beforeGetStudentsAdvice: Логируем получение списка студентов после вызова метода getStudents");
    }
}
