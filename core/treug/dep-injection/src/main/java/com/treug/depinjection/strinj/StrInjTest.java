package com.treug.depinjection.strinj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StrInjTest {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("appContext.xml");

    Person person = context.getBean("strPerson", Person.class);
    person.callYourPet();


    System.out.println(person.getSurName());
    System.out.println(person.getAge());

    context.close();

  }
}
