package com.training.task3.java;

public class Book {
    public long bookID;
    public String title;
    public String author;
    public Boolean isAvailable;

    @Override
    public String toString() {
        return "{" +
                "bookID=" + bookID +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
    public Book (long bookID, String title , String author,Boolean isAvailable){
        this.bookID  = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable=isAvailable;
    }

}
