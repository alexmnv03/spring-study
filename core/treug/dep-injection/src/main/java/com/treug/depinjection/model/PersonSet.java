package com.treug.depinjection.model;

public class PersonSet {

  private Pet pet;

  public PersonSet() {
    System.out.println("PersonSet bean is created");
  }

  public void setPet(Pet pet) {
    System.out.println("Person add animal");
    this.pet = pet;
  }

  public void callYourPet() {
    System.out.println("Hell! my love pet!");
    pet.say();
  }

}
