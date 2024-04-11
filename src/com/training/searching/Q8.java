package com.training.searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(obj.nextInt());
        }
        int result = list.stream().max(Integer::compare).get();

        System.out.println(list.indexOf(result));
    }
}
