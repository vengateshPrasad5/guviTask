package com.training.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] mergedArr = new int [n+n];
        for (int i = 0; i < n; i++) {
            arr1[i] = obj.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = obj.nextInt();
        }
        for (int i = 0; i < mergedArr.length; i++) {
            for (int j = 0; j < n; j++) {
                mergedArr[j] = arr1[j];
            }
        }
        for (int i = 0; i < mergedArr.length; i++) {
            for (int j = 0; j < n; j++) {
                mergedArr[n+j] = arr2[j];
            }
        }
        Arrays.sort(mergedArr);
        System.out.println(mergedArr[mergedArr.length / 2] +
                            mergedArr[mergedArr.length / 2 - 1]);


    }
}
