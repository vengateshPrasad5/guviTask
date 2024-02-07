package com.training.task3.java;

import java.util.Scanner;

public class TaxCalculator {
   static Scanner obj = new Scanner(System.in);
    static Employee employee;
    static Product product;
    public static void main(String[] args) {

        System.out.println("0 --> Exit \n" +
                "1 --> Employee Information \n" +
                "2 ---> Product Information");

        int option;

        do {
            System.out.println("Enter Option");
            option = obj.nextInt();
            switch (option){
                case 1: employeeTax();
                break;
                case 2: productTax();
                break;
                default:
                    System.out.println("Enter Valid option");
            }
        }while ( option!=0);

    }
    public static void employeeTax(){
        System.out.println("Enter emp ID");
        int empID = obj.nextInt();
        obj.nextLine();
        System.out.println("Enter Name");
        String name = obj.nextLine();
        System.out.println("Enter monthly salary");
        long salary  = obj.nextLong();
        employee = new Employee(empID,name,salary);
        System.out.println("Employee Information "+employee);
        employee.calculateTax();
    }
    public static void productTax(){
        System.out.println("Enter pid");
        int pid = obj.nextInt();
        System.out.println("Enter Price");
        double price = obj.nextDouble();
        System.out.println("Enter quantity");
        int qty  = obj.nextInt();
        product = new Product(pid,price,qty);
        System.out.println("Product Information "+product);
        product.calculateTax();
    }
}
