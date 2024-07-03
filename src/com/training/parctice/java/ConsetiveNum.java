package com.training.parctice.java;

import java.util.*;

public class ConsetiveNum {
    public static void main(String[] args) {
        int[] arr = {100,98,-1,0,99,1,3,4,2,5,67};
        int result = longestConsecutiveNumber(arr);
        System.out.println("result = " + result);
    }

    public static int longestConsecutiveNumber(int[] arr){
        int longStreak = 0;
        Set<Integer> set =  new HashSet<>();
        for(int a: arr){
            set.add(a);
        }
        for(int num : set) {
            int streak = 0;
            if (!set.contains(num - 1)) {
                int currnum = num;
                streak = 0;
                while (set.contains(currnum)) {
                    currnum++;
                    streak++;
                }
            }
            longStreak = Math.max(longStreak, streak);
        }
        return longStreak;
    }
}
