package com.treug.depinjection.model;

public class Dog implements Pet {
  public void say() {
    System.out.println("Bow-Wow");
  }

  public Dog() {
    System.out.println("Dog bean is created");
  }


}
