package com.training.DesignPattern.PrototypeDP;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    public String shopName;
    List<Book> books = new ArrayList<>();

    public void loadData(){
        for (int i = 1; i <= 3; i++) {
            Book book = new Book();
            book.setBid(i);
            book.setBname("Book "+i);
            getBooks().add(book);
        }
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {

        BookShop bookShop = new BookShop();
        for (Book book : this.getBooks()){
            bookShop.getBooks().add(book);
        }
        return bookShop;
    }
}
