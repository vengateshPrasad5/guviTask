package com.training.dataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int n = obj.nextInt();
        List<Double> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(Math.floor(Math.random()*n)); // used obj.nextInt()
        }
        System.out.println(list);
        list.stream().collect(Collectors.toList()); // require to make the list immutable using toList method
        Collections.reverse(list);
        System.out.println("math"+Math.floor(Math.random()*n));
        for (int i = 0 ; i < n ;i++){
            System.out.print(list.get(i));
            if(i < n-1){
                System.out.print("->"); // avoid arrow mark after last element
            }
        }

    }
}
