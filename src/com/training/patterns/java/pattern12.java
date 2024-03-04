package com.training.patterns.java;

import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int n = obj.nextInt();

        for (int i = n; i >= 1 ; i--) {
            for (int j = 0; j < i ; j++) {
                 System.out.print("*");
//              avoid adding space after last element
                if(j < i-1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
