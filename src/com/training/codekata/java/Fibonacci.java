package com.training.codekata.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);

        int a = obj.nextInt();

        Integer[] b = { 1,2,3,4,5,6};
        Arrays.sort(b, Collections.reverseOrder());
        System.out.println(b);
        int num1 = 0;
        int num2 = 1 ;

        for (int i = 0; i < a; i++) {
            if( i < a - 1){
                System.out.print(num1 + " " );
            } else {
                System.out.print(num1);
            }
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
