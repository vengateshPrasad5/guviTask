package com.training.searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int testCases = obj.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < testCases; i++) {
            int numOfBuilding = obj.nextInt();
            for (int j = 0; j < numOfBuilding; j++) {
              list.add(obj.nextInt());
            }
            int building = list.getLast();
            for (int j = numOfBuilding-1; j >= 0 ; j--) {
               if(list.get(j) > building){
                   count++;
                   building = list.get(j);
               }
            }
            result.add(count);
            count = 1;
        }
        for (Integer in : result){
            System.out.println(in);
        }
    }
}
