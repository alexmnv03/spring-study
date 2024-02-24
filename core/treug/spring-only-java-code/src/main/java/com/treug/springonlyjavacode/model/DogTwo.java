package com.treug.springonlyjavacode.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class DogTwo implements Pet {

  public DogTwo() {
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
