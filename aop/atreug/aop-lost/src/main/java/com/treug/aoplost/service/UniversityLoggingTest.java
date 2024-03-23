package com.treug.aoplost.service;

import com.treug.aoplost.config.MyConfig;
import com.treug.aoplost.model.Student;
import com.treug.aoplost.model.University;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UniversityLoggingTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);
        university.addStudent();
        try {
            List<Student> list = university.getStudents();
            System.out.println(list);
        } catch (Exception e) {
            System.out.println("Было поймано исключение " + e);
        }
        context.close();
    }
}
