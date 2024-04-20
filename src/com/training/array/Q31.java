package com.training.array;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int N = obj.nextInt();
        int K =  obj.nextInt();
        int[] arr =  new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = obj.nextInt();
        }

        int count = -1;
        for (int i = 0; i < N; i++) {
            if(arr[i] == K){
                count++;
            }
        }
        if(count >= 0){
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}
