package com.training.DesignPattern.PrototypeDP;

public class PMain {
    public static void main(String[] args) throws CloneNotSupportedException {
      BookShop bookShop = new BookShop();
      bookShop.setShopName("Ren Shop");
      bookShop.loadData();

        BookShop bookShop1 = bookShop.clone();
        bookShop.getBooks().remove(0);
        bookShop1.setShopName("Gen Shop");
        System.out.println(bookShop);
        System.out.println(bookShop1);
    }
}
