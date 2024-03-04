package com.training.numbers.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxFrequency {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        for(int elem : arr){
            int count;
            if(map.containsKey(elem)){
                count = map.get(elem);
                map.put(elem,count+1);
            }else{
                map.put(elem,1);
            }
        }
        int maxFreq = 0;
        int maxValue = Integer.MAX_VALUE;
        for (Map.Entry<Integer,Integer> elem : map.entrySet()){
            if(elem.getValue() > maxFreq){
                maxFreq = elem.getValue();
                maxValue = elem.getKey();
            }
        }
        System.out.println(maxValue);
    }
}
