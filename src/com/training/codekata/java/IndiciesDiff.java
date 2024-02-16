package com.training.codekata.java;

import java.util.ArrayList;

public class IndiciesDiff {
//    Print the difference of indices of largest and smallest array

    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(6);
        n.add(7);
        n.add(9);
        n.add(10);
        n.add(15);
        int min = n.getFirst();
        int max = n.getFirst();
        int maxIndex=0;
        int minIndex=0;

        System.out.println(n);
        for (int i = 1; i < n.size(); i++) {
          if(max < n.get(i)){
              max = n.get(i);
              maxIndex = n.indexOf(max);
          }
            if(min > n.get(i)){
                min = n.get(i);
                minIndex = n.indexOf(min);
            }
        }
        System.out.println("max " + max);
        System.out.println("min " + min);
        System.out.println("maxIndex "+ maxIndex);
        System.out.println("minIndex "+ minIndex);
        System.out.println("indices difference " + (maxIndex - minIndex));
    }
}
