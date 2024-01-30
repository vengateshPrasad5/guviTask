package com.training.task2.java;

import java.util.*;

public class MainDemo {
    public static void main(String[] args) {
        Product[] product1 = new Product[5];
        Scanner obj = new Scanner(System.in);
        int productID;
        double rate;
        int quantity;
        double price;
        double total = 0.0;
        Map<Integer, Double> map = new HashMap<>();
        Map.Entry<Integer, Double> maxValue = null;
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
            map.put(productID, price);
            product1[i] = new Product(productID, rate, quantity);

        }

//        To get the max value of map
        for (Map.Entry<Integer, Double> entry : map.entrySet()) {
            if (maxValue == null || entry.getValue().compareTo(maxValue.getValue()) > 0) {
                maxValue = entry;
            }
        }
//        Print Product information
        System.out.println("\nProduct Information:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Product " + (i + 1) + ": PID=" + product1[i].pid + ", Price=" + product1[i].price + ", Quantity=" + product1[i].quantity);
        } // Sample Output Product Information:
      /* Product 1: PID=1, Price=21.0, Quantity=1
         Product 2: PID=2, Price=11.0, Quantity=3
         Product 3: PID=3, Price=12.0, Quantity=2
         Product 4: PID=4, Price=33.0, Quantity=4
         Product 5: PID=5, Price=54.0, Quantity=1 */

        System.out.println(map); // Sample Output: {1=21.0, 2=33.0, 3=24.0, 4=132.0, 5=54.0}
        System.out.println("Total Price " + total); // Sample Output: Total Price 264.0

//        if function written to avoid warning on null as maxvalue
        if (maxValue != null) {
            System.out.println("Product Id of the  highest price is " + maxValue.getKey()); // Sample Output:Product ID of the  highest price is 4
        }
    }

}
