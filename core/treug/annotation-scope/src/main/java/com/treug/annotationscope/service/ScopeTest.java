package com.treug.annotationscope.service;

import com.treug.annotationscope.model.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("appContext.xml");

    Dog myDog = context.getBean("dog", Dog.class);
    Dog yourDog = context.getBean("dog", Dog.class);

    System.out.println("Ссылаются на один и тот же объект?: " + (myDog == yourDog));
    System.out.println(myDog);
    System.out.println(yourDog);

    context.close();
  }
}
