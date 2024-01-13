package com.treug.depinjection.one;

import com.treug.depinjection.model.Person;
import com.treug.depinjection.model.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PetSpringTest {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("appContext.xml");

    Pet pet = context.getBean("myPet", Pet.class);

    Person person = new Person(pet);
    person.callYourPet();

    Pet petCat = context.getBean("myPetCat", Pet.class);

    Person personCat = new Person(pet);
    personCat.callYourPet();

  }
}
