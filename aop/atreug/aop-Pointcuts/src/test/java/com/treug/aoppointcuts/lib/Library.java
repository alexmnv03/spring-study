package com.treug.aoppointcuts.lib;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library extends AbstractLibrary{

  public void getBook(){
    System.out.println("Мы берем книгу");
  }
}
