package com.treug.aoppointcuts.service;

import com.treug.aoppointcuts.config.MyConfig;
import com.treug.aoppointcuts.lib.UniLibraryCombo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UniLibraryComboTest {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(MyConfig.class);

    UniLibraryCombo uniLibraryCombo = context.getBean("uniLibraryCombo", UniLibraryCombo.class);
    uniLibraryCombo.getBook();
    uniLibraryCombo.getMagazine();
    uniLibraryCombo.returnBook();
    uniLibraryCombo.addBook();


    context.close();
  }
}


