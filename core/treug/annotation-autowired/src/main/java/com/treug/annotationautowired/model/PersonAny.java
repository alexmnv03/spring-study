package com.treug.annotationautowired.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personAnyBean")
public class PersonAny {
  private Pet pet;
  private String surName;
  private int age;

  @Autowired
  public void anyMetodPet(Pet pet) {
    System.out.println("Person add animal any metod");
    this.pet = pet;
  }

  public Pet getPet() {
    return pet;
  }

  public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    System.out.println("com.treug.depinjection.strinj.Person set surName");
    this.surName = surName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    System.out.println("com.treug.depinjection.strinj.Person set age");
    this.age = age;
  }

  public void callYourPet() {
    System.out.println("Hell! my love pet!");
    pet.say();
  }

}
