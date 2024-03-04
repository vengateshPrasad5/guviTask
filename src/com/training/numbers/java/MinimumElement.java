package com.training.numbers.java;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        for(int elem : arr){
            if(min > elem){
                min = elem;
            }
        }
        System.out.println(min);
    }
}
