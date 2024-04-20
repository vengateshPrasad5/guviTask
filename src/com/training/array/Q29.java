package com.training.array;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= obj.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int y = arr[x];
            arr[i] = x + (y%n) * n; // 1 + 20%5 * 5
        }

        for (int i = 0; i < n; i++) {
            arr[i] /= n;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if( i < n-1){
                System.out.print(" ");
            }
        }
    }
}
