package com.training.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q47 {
    public static void main(String[] args) {
//        Scanner obj = new Scanner(System.in);
//        int ele = obj.nextInt();
        int[] arr = {5,1,7,11,16,19};
//        int[] arr = new int[ele];
//        for (int i = 0; i < ele; i++) {
//            arr[i] = obj.nextInt();
//        }
//        5 1 7 11 16 19
        printAlternativeArray(arr);
    }

    private static void printAlternativeArray(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;

        int start = 0;
        int end = n - 1;

        System.out.print(arr[end]);
        end--;

        for (int i = 1; i < n; i++) {
            if (i != n - 1 && i % 2 == 0 ) {
                 System.out.print(" "+arr[end]);
                 end--;
            }else {
                System.out.print(" "+ arr[start]);
                start++;
            }
        }
    }
}
