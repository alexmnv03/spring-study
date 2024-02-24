package com.treug.springonlyjavacode.service;

import com.treug.springonlyjavacode.config.MyConfigTwo;
import com.treug.springonlyjavacode.model.Person;
import com.treug.springonlyjavacode.model.PersonTwo;
import com.treug.springonlyjavacode.model.Pet;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyConfigTwoTest {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(MyConfigTwo.class);

    Pet petCat = context.getBean("catBean", Pet.class);
    petCat.say();
    Pet petCatTwo = context.getBean("catBean", Pet.class);
    System.out.println(petCat == petCatTwo);

    PersonTwo personTwo = context.getBean("personTwo", PersonTwo.class);

    personTwo.callYourPet();

    context.close();
  }
}
