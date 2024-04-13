package com.training.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int arrSize = obj.nextInt();
        int difference = obj.nextInt();
        List<Integer> list =  new ArrayList<>();
        List<Integer> result =  new ArrayList<>();

        for (int i = 0; i < arrSize; i++) {
            list.add(obj.nextInt() );
        }
        list.add(list.getFirst()); // for closed loop
        for (int i = 0; i < arrSize ; i++) {
            if(Math.abs(list.get(i) - list.get(i+1)) > difference){
                result.add(1);
            } else {
                result.add(0);
            }
        }
        for (int i = 0; i < arrSize; i++) {
            System.out.print (result.get(i));
            if(i < arrSize-1){
                System.out.print(" ");
            }
        }
    }
}
