package com.treug.annotationqualifier.service;

import com.treug.annotationqualifier.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personSetBean")
public class PersonSet {

  private Pet pet;
  private String surName;
  private int age;

  @Autowired
  @Qualifier("catBean")
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
