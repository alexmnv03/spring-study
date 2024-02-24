package com.treug.initdestroy.model;

public class Dog implements Pet {

  public Dog() {
    System.out.println("Dog Bean in create");
  }

  public void say() {
    System.out.println("Bow-Wow");
  }

  public void init() {
    System.out.println("Class Dog: init method");
  }

  public void destroy() {
    System.out.println("Class Dog: destroy method");
  }

}
