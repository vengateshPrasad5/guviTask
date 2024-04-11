package com.training.searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int n1 = obj.nextInt();
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            listA.add(obj.nextInt());
        }
        int n2 = obj.nextInt();
        for (int i = 0; i < n2; i++) {
            listB.add(obj.nextInt());
        }
        System.out.println(listA);
        System.out.println(listB);
        String result = "yes";
        for(Integer item : listB){
            if((listB.size() < listA.size()) && (! listA.contains(item))){
                result = "no";
                break;
            }
        }
        System.out.println(result);
    }
}
