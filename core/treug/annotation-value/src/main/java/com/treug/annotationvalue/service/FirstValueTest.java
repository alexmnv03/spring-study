package com.treug.annotationvalue.service;

import com.treug.annotationvalue.model.Person;
import com.treug.annotationvalue.model.PersonValue;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstValueTest {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("appContext.xml");

    Person person = context.getBean("personBean", Person.class);
    person.callYourPet();

    System.out.println(person.getSurName());
    System.out.println(person.getAge());

    PersonValue personValue = context.getBean("personValueBean", PersonValue.class);
    personValue.callYourPet();

    System.out.println(personValue.getSurName());
    System.out.println(personValue.getAge());

    context.close();

  }
}
