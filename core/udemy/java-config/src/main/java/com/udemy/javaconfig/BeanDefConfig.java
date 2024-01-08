package com.udemy.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDefConfig {

  // define bean for our sad fortune service
  @Bean
  public FortuneService sadFortuneService() {
    return new SadFortuneService();
  }

  // define bean for our swim coach AND inject dependency
  @Bean
  public Coach swimCoach() {
    SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());

    return mySwimCoach;
  }

}
