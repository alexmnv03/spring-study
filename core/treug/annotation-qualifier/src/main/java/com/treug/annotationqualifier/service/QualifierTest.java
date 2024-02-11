package com.treug.annotationqualifier.service;

import com.treug.annotationqualifier.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierTest {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("appContext.xml");

    Person person = context.getBean("personBean", Person.class);
    person.callYourPet();

    PersonSet personSet = context.getBean("personSetBean", PersonSet.class);
    personSet.callYourPet();

    context.close();

  }
}
