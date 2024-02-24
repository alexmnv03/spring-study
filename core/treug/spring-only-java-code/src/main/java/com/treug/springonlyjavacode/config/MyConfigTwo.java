package com.treug.springonlyjavacode.config;

import com.treug.springonlyjavacode.model.Cat;
import com.treug.springonlyjavacode.model.PersonTwo;
import com.treug.springonlyjavacode.model.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfigTwo {

  @Bean
  @Scope("singleton")
  public Pet catBean(){
    System.out.println("catBean created!!!");
    return new Cat();
  }

  @Bean
  public PersonTwo personTwo(){
    return new PersonTwo(catBean());
  }

}
