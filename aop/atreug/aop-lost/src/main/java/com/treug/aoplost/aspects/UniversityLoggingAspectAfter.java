package com.treug.aoplost.aspects;

import org.aspectj.lang.annotation.After;

public class UniversityLoggingAspectAfter {

    @After("execution(* getStudents())")
    public void afterGetStudentsAdvice() {
        System.out.println("afterGetStudentsAdvice: Логируем завершение работы метода getStudents");
    }

}
