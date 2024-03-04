package com.training.numbers.java;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        for (int elem : arr){
            if(elem % k == 0 ){
                System.out.print(1);
            }else {
                System.out.print(0);
            }
            if(!(elem == arr[arr.length-1]) ){
                System.out.print(" ");
            }
        }
    }
}
