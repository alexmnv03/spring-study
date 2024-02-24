package com.treug.springonlyjavacode.service;

import com.treug.springonlyjavacode.config.MyConfig;
import com.treug.springonlyjavacode.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyConfigTest {
  
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(MyConfig.class);

    Person person = context.getBean("personBean", Person.class);

    person.callYourPet();

    context.close();
  }
}
