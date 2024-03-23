package com.treug.aoplost.aspects;

import com.treug.aoplost.model.Student;
import java.util.List;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @AfterThrowing("execution(* getStudents())")
//    public void afterThrowingGetStudentsAdvice() {
//        System.out.println("afterThrowingGetStudentsAdvice: Логируем выброс исключения при работе метода getStudents");
//    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing ="exeption")
    public void afterThrowingGetStudentsAdvice(Throwable exeption) {
        System.out.println("afterThrowingGetStudentsAdvice: Логируем выброс исключения при работе метода getStudents");
    }

}
