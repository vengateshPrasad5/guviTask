package com.training.DailyByte;

import java.util.*;
import java.util.stream.Collectors;

public class KLargestNumber {
    public static void main(String[] args) {
//        [1, 2, 3], k = 1, return 3.
//                [9, 2, 1, 7, 3, 2], k = 5, return 2.
        int[] n  =  new int[]{9, 2, 1, 7, 3, 2};
        int[] m = new int[]{1,2,3};
        int k = 1;
        int l = 5;
        int largestElement = findLargestElem(n,l);
        System.out.println("largestNum = " + largestElement);
    }

    private static int findLargestElem(int[] n, int k) {
        Arrays.sort(n);
        for (int nn : n){
         System.out.print( nn+" ");
        }
        return n[n.length - k];
    }

}
