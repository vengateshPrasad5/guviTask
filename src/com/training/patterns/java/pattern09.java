package com.training.patterns.java;

import java.util.Scanner;

public class pattern09 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int count = 1 ;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++);
                if(j < i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
