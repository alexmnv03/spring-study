package com.treug.aoppoint.aspects;

import com.treug.aoppoint.lib.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class SecurityAspect {

    @Before("com.treug.aoppoint.aspects.MyPointcut.allAddMethod())")
    public void beforeAddBookAdvice(JoinPoint joinpoint){
        MethodSignature methodSignature = (MethodSignature)joinpoint.getSignature();
        System.out.println("methodSignature = "  + methodSignature);
        System.out.println("methodSignature = "  + methodSignature.getMethod());
        System.out.println("methodSignature = "  + methodSignature.getReturnType());
        System.out.println("methodSignature = "  + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinpoint.getArgs();
            for (Object obj: arguments) {
                if(obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге, название " + myBook.getName()
                    + " автор " + myBook.getAuthor()
                    + " год издания " + myBook.getYearOfPublication());
                } else if (obj instanceof String){
                    System.out.println("Книгу в библиотеку добавил " + obj);
                }
            }
        }
        System.out.println("beforeGetBookAdvice: Попытка получить книгу/журнал");
    }

    @Before("com.treug.aoppoint.aspects.MyPointcut.allAddMethod())")
    public void beforeAddSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение");
    }

}
