package com.treug.aoppointcuts.service;

import com.treug.aoppointcuts.config.MyConfig;
import com.treug.aoppointcuts.lib.UniLibraryTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UniLibraryTwoTest {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(MyConfig.class);

    UniLibraryTwo uniLibraryTwo = context.getBean("uniLibraryTwo", UniLibraryTwo.class);
    uniLibraryTwo.getBook("Отцы и дети");
    uniLibraryTwo.getMagazine(18);


    context.close();
  }
}

