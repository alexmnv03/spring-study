package com.treug.aoppointcuts.lib;

import org.springframework.stereotype.Component;

@Component
public class UniLibraryTwo {

    public void getBook(String bookName){
        System.out.println("Мы берем книгу из UniLibrary" + bookName);
    }

//    public void returnBook(){
//        System.out.println("Мы возвращаем книгу UniLibrary");
//    }

    public void getMagazine(int count){
        System.out.println("Мы берем журнал из UniLibrary " + count);
    }

}

