package com.treug.aoporderaspect.lib;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

  @Value("Отцы и дети")
  private String name;

  public String getName() {
    return name;
  }
}