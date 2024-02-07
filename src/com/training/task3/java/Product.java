package com.training.task3.java;

public class Product implements Taxable {
    int pid ;
    double price ;
    int quantity ;

    public Product (int pid, double price , int quantity){
        this.pid  = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "[" +
                "pid=" + pid +
                ", price=" + price +
                ", quantity=" + quantity +
                ']';
    }

    @Override
    public void calculateTax() {
        double unitResult = price*salesTax;
        double totalResult = (price*quantity)*salesTax;
        System.out.println("Sales tax for Unit price of a product :"+ String.format("%.2f",unitResult));
        System.out.println("Sales tax for Total price of a product :"+ String.format("%.2f",totalResult));
    }
}
