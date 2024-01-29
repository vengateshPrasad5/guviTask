package com.training.codekata.java;

import java.util.Scanner;

public class ArrayBeautiful {


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        int[] arr = new int[n];

        // System.out.println("The Input Provided is: " + userInput);
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        int result = isBeautifulArray(arr);
        System.out.println(result);
    }

     static int isBeautifulArray( int[] arr) {
         int total = 0;
        for (int sum : arr) {
             total += sum;
        }
        if (total % 2 == 0 && total % 3 == 0 && total % 5 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
