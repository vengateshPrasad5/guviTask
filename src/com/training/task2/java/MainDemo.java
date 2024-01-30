package com.training.task2.java;

import java.util.*;

public class MainDemo {
    public static void main(String[] args) {
        Product[] product1 = new Product[5];
        Scanner obj =  new Scanner(System.in);
        int productID = 0;
        double rate = 0.0;
        int quantity = 0;
        double price = 0.0 ;
        double total = 0.0 ;
        Map<Integer,Double> map = new HashMap<>();
        Map.Entry<Integer,Double> maxValue = null;

//        Enter five product detail
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Product Details");
            System.out.println("Enter Product ID");
            productID = obj.nextInt();
            System.out.println("Enter Rate");
            rate = obj.nextInt();
            System.out.println("Enter Quantity");
            quantity = obj.nextInt();
//          Calculate the unit price
            price = rate * quantity;
//          Calculate the total price
            total += price;
//          Map the total price and unit price to find the highest price pid
            map.put(productID,price);
            product1[i] = new Product(productID,rate,quantity);
        }
//        To get the max value of map
        for(Map.Entry<Integer,Double> entry : map.entrySet()){
            if( maxValue == null || entry.getValue().compareTo(maxValue.getValue()) > 0){
                maxValue = entry;
            }
        }
//        Print Product information
        System.out.println("\nProduct Information:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Product " + (i + 1) + ": PID=" + product1[i].pid +
                    ", Price=" + product1[i].price + ", Quantity=" + product1[i].quantity);
        }
        System.out.println(map); // Output: {1=21.0, 2=34.0, 3 =66.0, 4 =62.0, 5=45.0}
        System.out.println("Total Price "+ total); // Output: Total price : 228.0

//        if function written to avoid warning on null as maxvalue
        if (maxValue != null){
            System.out.println("Product Id of the  highest price is " + maxValue.getKey()); // Output: Pid of the highest price is 3
        }
    }

}
