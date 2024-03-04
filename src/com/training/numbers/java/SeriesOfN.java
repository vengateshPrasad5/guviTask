package com.training.numbers.java;

import java.util.Scanner;

public class SeriesOfN {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int num1 = 1;
        int num2 = 1;
        for (int i = 1; i <= n; i++) {
            if(n <= 3){
                if(i<=n/2){
                    num1*=i;
                }
                if(i>n/2){
                    num2*=i;
                }
            }
            if(n > 3){
                if(i<=n/2){
                    num1*=i;
                }
                if(i>n/2){
                    num2*=i;
                }
            }
        }
        if(n == 3){
            System.out.println(num1+" "+num2);

        }else{
            System.out.println(1 +" "+num1+" "+num2);
        }
    }
}
