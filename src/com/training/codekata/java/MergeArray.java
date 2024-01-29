package com.training.codekata.java;

import java.util.*;
public class MergeArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        int[] arr_n = new int[n];
        int[] arr_m = new int[m];

        Arrays.sort(arr_n);
        Arrays.sort(arr_m);
        for (int i = 0; i < n; i++) {
            arr_n[i] = obj.nextInt();
        }
        for (int j = 0; j < m; j++) {
            arr_m[j] = obj.nextInt();
        }

    }

}
