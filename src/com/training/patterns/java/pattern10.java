package com.training.patterns.java;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int n = obj.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j =1; j <= n; j++) {
                if(i+j <= n){
                    System.out.print("-");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
