package com.treug.beanscope.one;

import com.treug.beanscope.model.Cat;
import com.treug.beanscope.model.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeAppTest {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("appContext.xml");

    Dog dog = context.getBean("myPet", Dog.class);
    Dog dogTwo = context.getBean("myPet", Dog.class);

    System.out.println("Это один и тот же объект:" + (dog == dogTwo));
    System.out.println(dog);
    System.out.println(dogTwo);

    dog.setName("Baron");
    dogTwo.setName("Amur");

    System.out.println(dog.getName());
    System.out.println(dogTwo.getName());

    Cat cat = context.getBean("myPetCat", Cat.class);
    Cat catTwo = context.getBean("myPetCat", Cat.class);

    System.out.println("Это один и тот же объект: " + (cat == catTwo));
    System.out.println(cat);
    System.out.println(catTwo);


    cat.setName("Barsik");
    catTwo.setName("Mursic");

    System.out.println(cat.getName());
    System.out.println(catTwo.getName());


  }
}
