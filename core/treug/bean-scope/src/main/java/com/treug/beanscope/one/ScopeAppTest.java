package com.treug.beanscope.one;

import com.treug.beanscope.model.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeAppTest {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("appContext.xml");

    Dog dog = context.getBean("myPet", Dog.class);
    Dog dogTwo = context.getBean("myPet", Dog.class);

    System.out.println("Это один и тот же объект" + (dog == dogTwo));
    System.out.println(dog);
    System.out.println(dogTwo);

    dog.setName("Baron");
    dogTwo.setName("Amur");

    System.out.println(dog.getName());
    System.out.println(dogTwo.getName());

  }
}
