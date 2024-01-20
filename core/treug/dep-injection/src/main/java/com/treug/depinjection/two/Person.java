package com.treug.depinjection.two;

import com.treug.depinjection.model.Pet;

public class Person {

  private Pet pet;
  private String surName;
  private int age;

  public Person(Pet pet) {
    System.out.println("Person bean is created");
    this.pet = pet;
  }

  public void setPet(Pet pet) {
    System.out.println("Person add animal");
    this.pet = pet;
  }

  public Pet getPet() {
    return pet;
  }

  public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    this.surName = surName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void callYourPet() {
    System.out.println("Hell! my love pet!");
  }
}
