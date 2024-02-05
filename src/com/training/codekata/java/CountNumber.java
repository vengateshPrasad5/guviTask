package com.training.codekata.java;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int a = obj.nextInt();
        int count = 0;
        while (a !=0){
            a /= 10;
            System.out.println("Number after each loop "+a);
            count++;
        }
        System.out.println("Number Count "+count);
    }
}
