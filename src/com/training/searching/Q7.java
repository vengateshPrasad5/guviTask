package com.training.searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int testCases = obj.nextInt();
        List<Integer> BatchList =  new ArrayList<>();
        List<Integer> BatchItems = new ArrayList<>();
        List<Integer> stolenItemIndex =  new ArrayList<>();

        for (int i = 0; i < testCases; i++) {
            int BatchSize = obj.nextInt();
            for (int j = 0; j < BatchSize; j++) {
                BatchList.add(obj.nextInt());
            }
            System.out.println(BatchList);
            for (int k = 0; k < BatchList.size()-1; k++) {
                BatchItems.add(obj.nextInt());
            }
            System.out.println(BatchItems);
            for (int l = 0; l < BatchList.size(); l++) {
                if(!BatchItems.contains(BatchList.get(l))){
                    stolenItemIndex.add(l);
                }
            }
            BatchList.clear();
            BatchItems.clear();
        }
        for(Integer i : stolenItemIndex){
            System.out.println(i);
        }
    }
}
