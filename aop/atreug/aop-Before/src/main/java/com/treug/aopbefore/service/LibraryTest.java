package com.treug.aopbefore.service;

import com.treug.aopbefore.config.MyConfig;
import com.treug.aopbefore.lib.Library;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryTest {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(MyConfig.class);

    Library library = context.getBean("libraryBean", Library.class);

    library.getBook();

    context.close();
  }
}
