package com.training.task3.java;


import java.util.ArrayList;

public class Library {
       ArrayList<Book> books;
    public Library(){
        books = new ArrayList<>();
    }
    // Method to add book to the library
    public void addBook(Book newBook){
//        Add the book to the books array
            books.add(newBook);
        System.out.println("Book Added");
    }

//    Method to display all books in the library
    public void displayBooks(){
//        get all book in the library
        System.out.println(books);
    }
//    Method to remove book using ID
    public  void removeBook(long bookID){
       for(int i = 0; i < books.size(); i++){
           if(bookID == books.get(i).bookID){
               books.remove(i);
               System.out.println("Book ID with "+bookID+" removed");
               return;
           }
       }

    }
//    Method to search book using ID
    public void searchBook(long bookID ){
       for(int i = 0; i < books.size(); i++){
           if(bookID == books.get(i).bookID){
               System.out.println( "{" +
                       "bookID=" + books.get(i).bookID +
                       ", title='" + books.get(i).title + '\'' +
                       ", author='" +books.get(i).author + '\'' +
                       ", isAvailable=" + books.get(i).isAvailable +
                       '}');
               return;
           }
       }
    }
}
