package com.treug.aoppoint.service;

import com.treug.aoppoint.config.MyConfig;
import com.treug.aoppoint.lib.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UniLibraryTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        uniLibrary.getBook();
        uniLibrary.returnBook();
        uniLibrary.getMagazine();


        context.close();
    }
}
