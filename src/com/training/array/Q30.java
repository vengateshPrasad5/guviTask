package com.training.array;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int result = 0;
        int s = getResult(n);
        for (int i = 2; i < n; i++) {
            if(i*i < n){
                result += i;
            }
        }
        System.out.println("results "+result);
        System.out.println("sum "+ s);
    }

    private static int getResult(int n) {
        // Calculate the sum of squares of digits
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
