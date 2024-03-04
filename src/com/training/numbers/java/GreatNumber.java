package com.training.numbers.java;

import java.util.ArrayList;
import java.util.Scanner;

public class GreatNumber {
//    number question 7
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n= obj.nextInt();
        int cl = n;
        int sum=0;
        int mul = 1;
        int result = 0;
        while (n!=0){
//          Get a number
            int number = n %10;
            sum += number;
            mul *= number;
//          Remove last number
            n /= 10;
        }
//        result=

        System.out.println(cl == mul+sum ? "Great" : "no");
    }
}
