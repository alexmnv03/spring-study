package com.treug.aoppointcuts.service;

import com.treug.aoppointcuts.config.MyConfig;
import com.treug.aoppointcuts.lib.SchoolLibrary;
import com.treug.aoppointcuts.lib.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryTest {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(MyConfig.class);

    UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
    uniLibrary.getBook();

    SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
    schoolLibrary.getBook();

    context.close();
  }
}

