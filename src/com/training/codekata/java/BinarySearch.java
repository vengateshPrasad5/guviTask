package com.training.codekata.java;

import java.util.Scanner;

//Given 2 numbers N and K followed by N elements, find the Kth smallest element.
//If the element cannot be found then print -1
//Input Size : N <= 100000
//Sample Testcase :
//INPUT
//5 2
//        1 1 2 4 5
//OUTPUT
//2
public class BinarySearch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        int left = 0;
        int right = n-1;
        int middle = 0;
        while (left <= right) {
            middle = (left+right)/2;
            if(arr[middle] == k){
                System.out.println(arr[middle]);
                return;
            } else if (  arr[middle] < k ){
                left = middle + 1;
            } else {
                right= middle - 1;
            }
        }
        System.out.println(-1);
    }
}
