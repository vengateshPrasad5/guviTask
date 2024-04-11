package com.training.searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int n = obj.nextInt();
        List<Integer> list =  new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(obj.nextInt());
        }
        int max = list.stream().max(Integer::compare).get();
        System.out.println(max);
        int firstMax = Integer.MIN_VALUE ;
        int secondMax = 0 ;
        for(int num : list){
            if(firstMax < num){
                secondMax = firstMax;
                firstMax = num;
            }
        }
        System.out.println("Second Largest number " + secondMax);
    }
}
