package com.training.doubt.java;

public class ArrConstructor {
    int pid ;
    double price ;
    int quantity ;

    public ArrConstructor (int pid, double price , int quantity){
        this.pid  = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ArrConstructor{" +
                "pid=" + pid +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
