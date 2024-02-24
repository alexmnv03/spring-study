package com.treug.depinjection.model;

public class Person {

  private Pet pet;

  public Person(Pet pet) {
    System.out.println("Person bean is created");
    this.pet = pet;
  }

  public void setPet(Pet pet) {
    System.out.println("Person add animal");
    this.pet = pet;
  }

  public void callYourPet() {
    System.out.println("Hell! my love pet!");
  }
}
