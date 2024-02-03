package com.treug.initdestroy.one;

import com.treug.initdestroy.model.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DogTest {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("appContext.xml");

    Dog myDog = context.getBean("myPet", Dog.class);
    myDog.say();

    context.close();
  }
}
