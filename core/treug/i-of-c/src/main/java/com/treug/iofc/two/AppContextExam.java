package com.treug.iofc.two;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContextExam {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("aplicationContext.xml");
    Pet pet = context.getBean("myPet", Pet.class);
    pet.say();

    context.close();

  }
}
