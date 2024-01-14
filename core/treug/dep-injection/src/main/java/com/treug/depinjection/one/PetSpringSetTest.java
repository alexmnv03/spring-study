package com.treug.depinjection.one;

import com.treug.depinjection.model.PersonSet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PetSpringSetTest {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("appContext.xml");

    PersonSet person = context.getBean("mySetPerson", PersonSet.class);
    person.callYourPet();

    context.close();

  }
}
