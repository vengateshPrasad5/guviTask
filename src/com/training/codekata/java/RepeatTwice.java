package com.training.codekata.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatTwice {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n  = obj.nextInt();
        int[] arr = new int[n];

        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0 ; i < n ; i++){
            arr[i] = obj.nextInt();
        }

        for(int j = 0 ; j < n ; j++){
            int c = arr[j];
            if(map.containsKey(c)){
                int existCount = map.get(c);
                map.put(c,existCount+1);
            } else {
                map.put(c,1);
            }
        }

//        System.out.println(map.entrySet());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                System.out.println(entry.getKey());
            }
        }
    }
}
