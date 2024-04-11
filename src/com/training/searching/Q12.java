package com.training.searching;

import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int testCases = obj.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        List<Integer> distinctSet = new ArrayList<>();

        for (int i = 0; i < testCases; i++) {
            int n = obj.nextInt();
            for (int j = 0; j < n; j++) {
                list.add(obj.nextInt());
            }
            int k = obj.nextInt();
//            List<Integer> sortedList = list.stream().distinct().sorted().toList();
            for (Integer item : list){
                if(!distinctSet.contains(item)){
                    distinctSet.add(item);
                }
            }
            Collections.sort(distinctSet);
            System.out.println(distinctSet);
            result.add(distinctSet.get(k-1));
            list.clear();
            distinctSet.clear();
        }
        for(Integer item : result){
            System.out.println(item);
        }
    }
}
