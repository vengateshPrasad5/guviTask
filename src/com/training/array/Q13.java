package com.training.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q13 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int numOfArr = obj.nextInt();
        List<Integer> list =  new ArrayList<>();
        for (int i = 1; i <= numOfArr; i++) {
            int arrSize = obj.nextInt();
            for (int j = 0; j < arrSize; j++) {
                list.add(obj.nextInt());
                Collections.sort(list);
            }
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j));
                if( i != numOfArr || !list.getLast().equals(list.get(j))){
                    System.out.print(" ");
                }
            }
            list.clear();
        }
    }
}
