package com.treug.aoppointcuts.service;

import com.treug.aoppointcuts.config.MyConfig;
import com.treug.aoppointcuts.lib.Book;
import com.treug.aoppointcuts.lib.UniLibraryAdvert;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UniLibraryAdvertTest {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(MyConfig.class);

    UniLibraryAdvert uniLibraryAdvert = context.getBean("uniLibraryAdvert", UniLibraryAdvert.class);
    Book book = context.getBean("book", Book.class);
    uniLibraryAdvert.getBook();
    uniLibraryAdvert.getMagazine();


    context.close();
  }
}


