package com.training.Leetcode;

import java.util.Arrays;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, arr2 = {2, 1, 4, 3, 9, 6};
        int[] result = relativeSortArray(arr1, arr2);
        for (int a : result){
            System.out.print(a+" ");
        }
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length];
        temp = arr1;
        for (int i = 0; i < arr2.length; i++) {
             temp[i + 1] = arr2[i];
        }
//        Arrays.sort(temp);
        return temp;
    }
}
