package com.udemy.ioc;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {


  @Override
  public String getDailyWorkout() {
    return "Practice your backhand volley";
  }

}
