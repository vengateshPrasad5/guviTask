package com.training.task2.java;

import java.util.ArrayList;

public class XYZ {
    public static void main(String[] args) {
        Product product1 =  new Product(4, 32.00,2);

        ArrayList<Integer> products = new ArrayList<Integer>();
        products.add(1);
        products.add(3);
        products.add(45);
        products.add(67);

        for(int prd : products){
            System.out.println("Pid " +prd);
        }
        for (Integer product : products) {
            System.out.println("Product ID: " + 1 +
                    ", Price: $" + 22 +
                    ", Quantity: " + 3);
        }
    }

}
