package com.treug.initdestroy.one;

import com.treug.initdestroy.model.Cat;
import com.treug.initdestroy.model.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DogTest {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("appContext.xml");

    Dog myDog = context.getBean("myPet", Dog.class);
    myDog.say();

    Dog yourDog = context.getBean("myPet", Dog.class);
    myDog.say();

    Cat myCat = context.getBean("myCat", Cat.class);
    myCat.say();

    Cat yourCat = context.getBean("myCat", Cat.class);
    yourCat.say();

    context.close();
  }
}
