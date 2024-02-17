package com.treug.annotationvalue.service;

import com.treug.annotationvalue.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstValueTest {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("appContext.xml");

    Person person = context.getBean("personBean", Person.class);
    person.callYourPet();

    System.out.println(person.getSurName());
    System.out.println(person.getAge());

    context.close();

  }
}
