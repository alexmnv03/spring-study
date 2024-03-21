package com.treug.aopafterreturning.service;

import com.treug.aopafterreturning.config.MyConfig;
import com.treug.aopafterreturning.model.Student;
import com.treug.aopafterreturning.model.University;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UniversityLoggingTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);
        university.addStudent();
        List<Student> list = university.getStudents();

        System.out.println(list);


        context.close();
    }
}
