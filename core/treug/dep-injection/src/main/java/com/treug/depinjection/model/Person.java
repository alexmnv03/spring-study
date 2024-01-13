package com.treug.depinjection.model;

public class Person {

  private Pet pet;

  public Person(Pet pet) {
    this.pet = pet;
  }

  public void callYourPet() {
    System.out.println("Hell! my love pet!");
  }
}
