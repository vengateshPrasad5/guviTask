package com.training.task3.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(123,"Wings Of Fire","Dr.A P J Abdul Kalam",true));
        books.add(new Book(784,"Optimizing Java","James Gough",false));
        books.add(new Book(247,"A Tale of Two Cities","Charles Dickens",true));
        books.add(new Book(398,"Physiology of Money","Morgan Housel",true));

//        to Print All Books
        for (Book book:books){
            System.out.println(book);
        }

//        get single book
        System.out.println(books.get(3));

    }
}
