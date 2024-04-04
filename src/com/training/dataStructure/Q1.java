package com.training.dataStructure;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int fact_a = 1;
        int fact_b = 1;
        for (int i = 1; i <= a; i++) {
            fact_a = fact_a * i;
        }
        for (int i = 1; i <= b; i++) {
            fact_b = fact_b * i;
        }
        System.out.println(fact_a/fact_b);
    }
}
