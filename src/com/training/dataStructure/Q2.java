package com.training.dataStructure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();
        int smallestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int elem = obj.nextInt();
            if(deque.isEmpty()){
                deque.push(elem);
                smallestNumber = deque.getFirst();
            }
            if(deque.size() >= 1 && elem < smallestNumber){
                deque.push(elem);
                smallestNumber = elem;
                System.out.print(smallestNumber);
            } else {
                System.out.print(smallestNumber);
            }
            if(i < n-1 ){
                System.out.print(" ");
            }
        }
    }
}
