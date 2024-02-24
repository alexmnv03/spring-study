package com.treug.beanscope.model;

public class Dog implements Pet {

  String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void say() {
    System.out.println("Bow-Wow");
  }

  public Dog() {
    System.out.println("Dog bean is created");
  }


}
