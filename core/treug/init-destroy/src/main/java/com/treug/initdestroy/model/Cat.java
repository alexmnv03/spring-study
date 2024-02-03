package com.treug.initdestroy.model;

public class Cat implements Pet{

  String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Cat() {
    System.out.println("Cat bean is created");
  }

  @Override
  public void say() {
    System.out.println("may-may");
  }

  public void init() {
    System.out.println("Class Cat: init method");
  }

  public void destroy() {
    System.out.println("Class Cat: destroy method");
  }


}
