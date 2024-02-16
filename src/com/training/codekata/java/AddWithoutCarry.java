package com.training.codekata.java;

import java.util.Scanner;

public class AddWithoutCarry {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int multiplier = 1;
        int res = 0;

        while (a >0 || b > 0){

//          get the last digit on each number and add
            int sum = a % 10 + b % 10;

//          removes carry of the sum if available
            sum %= 10;

//          add the num and maintain value
            res = (sum * multiplier) + res;
//          removed last number
            a/= 10;
            b /= 10;
//          increase the multiplier by 10 to maintain the position
            multiplier *=10;
        }
        System.out.println(res);
    }
}
