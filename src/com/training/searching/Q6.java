package com.training.searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int n = obj.nextInt();
        List<Integer> list =  new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(obj.nextInt());
        }
        int lowestPrice = list.stream().min(Integer::compare).get();
        System.out.println("Dealer"+list.indexOf(lowestPrice));
    }
}
