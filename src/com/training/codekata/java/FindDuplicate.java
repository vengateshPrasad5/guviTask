package com.training.codekata.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();
        int[] arr = new int[n];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i] = obj.nextInt();
        }

        for(int j=0;j<n;j++){
            int dup = arr[j];
            if(map.containsKey(dup)){
                int dupCount = map.get(dup);
                map.put(dup,dupCount+1);
            }else{
                map.put(dup,1);
            }
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey());
            }
        }
    }
}
