package com.treug.aoppoint.lib;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {

    public void getBook(){
        System.out.println("Мы берем книгу в UniLibrary");
        System.out.println("------------------------------------------");
    }

    public void addBook(String personName, Book book){
        System.out.println("Мы добавляем книгу из UniLibrary");
        System.out.println("------------------------------------------");
    }

    public void returnBook(){
        System.out.println("Мы возвращаем книгу UniLibrary");
        System.out.println("------------------------------------------");
    }

    public void getMagazine(){
        System.out.println("Мы берем журнал из UniLibrary");
        System.out.println("------------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("Мы возвращаем журнал UniLibrary");
        System.out.println("------------------------------------------");
    }

    public void addMagazine(){
        System.out.println("Мы добавляем журнал из UniLibrary");
        System.out.println("------------------------------------------");
    }

}
