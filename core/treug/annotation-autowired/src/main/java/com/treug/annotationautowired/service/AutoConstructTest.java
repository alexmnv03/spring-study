package com.treug.annotationautowired.service;

import com.treug.annotationautowired.model.Person;
import com.treug.annotationautowired.model.PersonAny;
import com.treug.annotationautowired.model.PersonField;
import com.treug.annotationautowired.model.PersonSet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoConstructTest {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("appContext.xml");

    Person person = context.getBean("personBean", Person.class);

    person.callYourPet();

    PersonSet personSet = context.getBean("personSetBean", PersonSet.class);
    personSet.callYourPet();

    PersonAny personAny = context.getBean("personAnyBean", PersonAny.class);
    personAny.callYourPet();

    PersonField personField = context.getBean("personFieldBean", PersonField.class);
    personField.callYourPet();

  }
}
