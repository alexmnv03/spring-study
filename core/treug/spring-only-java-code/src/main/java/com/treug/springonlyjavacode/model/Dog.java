package com.treug.springonlyjavacode.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
//@Scope("prototype")
public class Dog implements Pet {

  public Dog() {
    System.out.println("Dog Bean in create");
  }

  public void say() {
    System.out.println("Bow-Wow");
  }

  @PostConstruct
  public void init() {
    System.out.println("Class Dog: init method");
  }

  @PreDestroy
  public void destroy() {
    System.out.println("Class Dog: destroy method");
  }

}
