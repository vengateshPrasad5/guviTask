package com.training.searching;

import java.util.*;


public class Q20 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        List<Integer> productIds = new ArrayList<>();
        Map<Integer,Integer> idmap = new HashMap<>();
        int result =  0;
        for (int i = 0; i < n; i++) {
            productIds.add(obj.nextInt());
        }

        for (Integer in : productIds){
            if(idmap.containsKey(in)){
                int count = idmap.get(in);
                idmap.put(in,count + 1);
            } else {
                idmap.put(in,1);
            }
        }
        for(Map.Entry<Integer,Integer> set : idmap.entrySet()){
            if(set.getValue() == 3){
                result++;
            }
        }

        System.out.println(result);
    }
}
