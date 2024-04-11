package com.training.searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int n = obj.nextInt();
        List<Integer> markList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            markList.add(obj.nextInt());
        }

        int maxMarks = markList.stream().max(Integer::compare).get();
        System.out.println("Rajesh Maximum marks "+ maxMarks);
    }
}
