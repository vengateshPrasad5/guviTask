package com.training.doubt.java;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
//        ArrConstructor[] arrProduct = new ArrConstructor[5];
        Scanner obj = new Scanner(System.in);
        int productID;
        double rate;
        int quantity;
        double price;
        double total = 0.0;
        Map<Integer, Double> map = new HashMap<>();
        Map.Entry<Integer, Double> maxValue = null;
        List<ArrConstructor> arrList = new ArrayList<>();
//        Enter five product detail
        for (int i = 0; i < 2; i++) {
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
//            arrProduct[i] = new ArrConstructor(productID, rate, quantity);
            arrList.add(new ArrConstructor(productID, rate, quantity));
        }

        System.out.println(arrList.toString()); // Sample Output [com.training.doubt.java.ArrConstructor@5e9f23b4, com.training.doubt.java.ArrConstructor@4783da3f]

//        To get the max value of map
        for (Map.Entry<Integer, Double> entry : map.entrySet()) {
            if (maxValue == null || entry.getValue().compareTo(maxValue.getValue()) > 0) {
                maxValue = entry;
            }
        }

        System.out.println(map); // Sample Output: {1=21.0, 2=33.0, 3=24.0, 4=132.0, 5=54.0}
        System.out.println("Total Price " + total); // Sample Output: Total Price 264.0

//        if function written to avoid warning on null as maxvalue
        if (maxValue != null) {
            System.out.println("Product Id of the  highest price is " + maxValue.getKey()); // Sample Output:Product ID of the  highest price is 4
        }
    }
}
