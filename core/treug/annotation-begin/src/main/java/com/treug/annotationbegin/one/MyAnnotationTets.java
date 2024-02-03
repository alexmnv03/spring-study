package com.treug.annotationbegin.one;

import com.treug.annotationbegin.model.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAnnotationTets {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("appContext.xml");

    Cat myCat = context.getBean("catBean", Cat.class);
    myCat.say();

    context.close();

  }
}
