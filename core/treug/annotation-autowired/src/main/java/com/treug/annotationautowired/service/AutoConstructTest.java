package com.treug.annotationautowired.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoConstructTest {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("appContext.xml");


  }
}
