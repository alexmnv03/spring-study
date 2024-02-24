package com.treug.springonlyjavacode.model;

import org.springframework.stereotype.Component;

public class CatTwo implements Pet {


  public CatTwo() {
    System.out.println("Cat bean is created");
  }

  @Override
  public void say() {
    System.out.println("may-may");
  }


}
