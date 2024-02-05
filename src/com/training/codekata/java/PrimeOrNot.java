package com.training.codekata.java;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();

        System.out.println(primeOrNot(n) ? "True" :"False");
    }

    private static boolean primeOrNot(int n) {
        if(n <= 1){
            return false;
        } else{
            for(int i = 2; i <= n /2 ; i++ ){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
