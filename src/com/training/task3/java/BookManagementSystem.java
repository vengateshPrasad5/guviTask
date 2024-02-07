package com.training.task3.java;

import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        Scanner obj = new Scanner(System.in);
        System.out.println("Library System");
        System.out.println(" 1 ---> View All book \n 2 ---> Add Book \n 3 ---> Remove Book \n 4 ---> Search Book \n 0---> Exit ");
//       Default book to execute all book
        library.books.add(new Book(12345,"Wings of fire","Dr.A P J Abdul Kalam",true));
        library.books.add(new Book(12344,"Physiology of money","Hansen",false));

        int option;
        do {
            option = obj.nextInt();
            switch (option){
                case 1: library.displayBooks();
                break;
                case 2: {
                    System.out.println("Enter Book ID");
                    long bookID = obj.nextLong();
                    System.out.println("Enter Title");
                    String title = obj.nextLine();
                    obj.nextLine();
                    System.out.println("Enter Author");
                    String author = obj.nextLine();
                    System.out.println("Is Available [ true / false]");
                    boolean isAvail = obj.nextBoolean();
                    library.addBook(new Book(bookID,title,author,isAvail));
                }
                break;
                case 3:{
                    System.out.println("Enter Book ID to remove");
                    long bookID = obj.nextLong();
                    library.removeBook(bookID);
                }
                break;
                case 4:{
                    System.out.println("Enter Book ID");
                    long bookID = obj.nextLong();
                    library.searchBook(bookID);
                }
                break;
                default:
                    System.out.println("Enter valid option");
            }
        }while (option !=0);
    }
}
