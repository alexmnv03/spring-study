package com.treug.aoplost.model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class University {

    private List<Student> list = new ArrayList<>();

    public void addStudent() {
        Student st1 = new Student("vasa", 3, 4.31);
        Student st2 = new Student("pite", 2, 3.51);
        Student st3 = new Student("lena", 1, 3.91);
        list.add(st1);
        list.add(st2);
        list.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы метода getStudents");
        // создадим исключение
        System.out.println(list.get(3));
        System.out.println("Information from method getStudents");
        System.out.println(list);
        return list;
    }
}
