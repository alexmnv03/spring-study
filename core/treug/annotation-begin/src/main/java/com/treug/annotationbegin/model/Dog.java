package com.treug.annotationbegin.model;

public class Dog implements Pet {

  public Dog() {
    System.out.println("Dog Bean in create");
  }

  public void say() {
    System.out.println("Bow-Wow");
  }


}
