package com.treug.aopafterreturning.aspects;

import com.treug.aopafterreturning.model.Student;
import java.util.List;
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

//    @AfterReturning("execution(* getStudents())")
//    public void afterReturningGetStudentsAdvice() {
//        System.out.println("beforeGetStudentsAdvice: Логируем получение списка студентов после вызова метода getStudents");
//    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "list")
    public void afterReturningGetStudentsAdvice(List<Student> list) {
        Student first = list.get(0);
        String name = first.getName();
        name = "гр. " + name;
        first.setName(name);
        double avgGrate = first.getAvgGrade();
        avgGrate = avgGrate + 0.5;
        first.setAvgGrade(avgGrate);
        System.out.println("beforeGetStudentsAdvice: Логируем получение списка студентов после вызова метода getStudents");
    }

}
