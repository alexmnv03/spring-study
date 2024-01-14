package com.treug.depinjection.one;

import com.treug.depinjection.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PetSpringNextTest {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("appContext.xml");

    Person person = context.getBean("myPerson", Person.class);
    person.callYourPet();

    context.close();

  }
}
