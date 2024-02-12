package com.treug.annotationqualifier.service;

import com.treug.annotationqualifier.model.Person;
import com.treug.annotationqualifier.model.PersonConstruct;
import com.treug.annotationqualifier.model.PersonSet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierTest {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("appContext.xml");

    Person person = context.getBean("personBean", Person.class);
    person.callYourPet();

    PersonSet personSet = context.getBean("personSetBean", PersonSet.class);
    personSet.callYourPet();

    PersonConstruct personConstruct = context.getBean("personConstructBean", PersonConstruct.class);
    personConstruct.callYourPet();

    context.close();

  }
}
