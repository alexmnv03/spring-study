package com.treug.depinjection.one;

import com.treug.depinjection.model.Dog;
import com.treug.depinjection.model.Person;
import com.treug.depinjection.model.Pet;

public class PetTest {

  public static void main(String[] args) {
    Pet pet = new Dog();
    Person person = new Person(pet);
    person.callYourPet();

  }
}
