package com.treug.propertysource.config;

import com.treug.propertysource.model.Cat;
import com.treug.propertysource.model.Person;
import com.treug.propertysource.model.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:application.properties")
public class MyConfig {

  @Bean
  @Scope("singleton")
  public Pet catBean(){
    return new Cat();
  }

  @Bean
  public Person myPerson() {
    return new Person(catBean());
  }
}
