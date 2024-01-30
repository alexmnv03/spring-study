package com.treug.propertysource.one;

import com.treug.propertysource.config.MyConfig;
import com.treug.propertysource.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(MyConfig.class);

    Person person = context.getBean("myPerson", Person.class);

    System.out.println(person.getSurName());
    System.out.println(person.getAge());

    context.close();

  }
}
