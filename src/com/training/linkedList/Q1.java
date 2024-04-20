package com.training.linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int n = obj.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(obj.nextInt() );
        }
        int numToRemove = obj.nextInt();
        linkedList.removeIf(in -> in.equals(numToRemove));
        linkedList.forEach(x -> {
            if (x.equals(linkedList.getLast())) {
                System.out.print(x);
            } else {
                System.out.print(x + " ");
            }
        });
    }
}
