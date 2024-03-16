package com.treug.aoppoint.lib;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

  @Value("Отцы и дети")
  private String name;

    @Value("Достоевский")
    private String author;

    @Value("1867")
    private Integer yearOfPublication;

  public String getName() {
    return name;
  }

    public String getAuthor() {
        return author;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }
}
