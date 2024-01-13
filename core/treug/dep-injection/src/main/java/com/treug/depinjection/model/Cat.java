package com.treug.depinjection.model;

public class Cat implements Pet{

  @Override
  public void say() {
    System.out.println("may-may");
  }
}
