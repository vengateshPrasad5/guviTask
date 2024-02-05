package com.training.codekata.java;

import java.util.*;
public class MergeArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
//        System.out.println("Enter size n");
//        int n = obj.nextInt();
//        System.out.println("Enter size m");
//        int m = obj.nextInt();
        Integer[] nArr = {3,45,2};
        Integer[] mArr = {55,10,543};
        Integer[] mergedArr = new Integer[mArr.length+ nArr.length];

//        System.out.println(mergedArr.length);
//        Add Elements using loop
//        for(int i=0; i<n ;i++)
//            nArr[i] = obj.nextInt();
//
//        for(int i=0; i<m ;i++)
//            mArr[i] = obj.nextInt();
//        Ascending order
            Arrays.sort(nArr);
//        Descending order
        Arrays.sort(mArr,Collections.reverseOrder());

//        merge Array
        for(int i = 0; i < nArr.length; i++){
            mergedArr[i] = nArr[i];
        }

        for(int i = 0; i < mArr.length; i++){
            mergedArr[nArr.length+i] =  mArr[i];
        }

        for(int i = 0; i < mergedArr.length; i++){
            System.out.print(mergedArr[i]);
            if( i < mergedArr.length - 1 )
                System.out.print(" ");
        }
    }

}
