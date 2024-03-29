package com.example.beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

  public static void main(String[] args) {

    // load the spring configuration file
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve bean from spring container
    CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

    // call methods on the bean
    // ... let's come back to this ...
    System.out.println("getDailyWorkout:: " + theCoach.getDailyWorkout());

    System.out.println("getDailyFortune:: " + theCoach.getDailyFortune());

    // call our new methods to get the literal values
    System.out.println(theCoach.getEmailAddress());

    System.out.println(theCoach.getTeam());

    // close the context
    context.close();
  }

}
