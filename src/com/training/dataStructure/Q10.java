package com.training.dataStructure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner obj  =  new Scanner(System.in);
        String str = obj.nextLine();
        System.out.println(palindromeOrNot(str));
    }

    static String palindromeOrNot(String str){
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            deque.add(str.charAt(i));
        }
        if(deque.size() == 1) return "yes";
        while (deque.size() > 1){
            Character first = deque.pop();
            Character last = deque.removeLast();
            System.out.println("first "+first);
            System.out.println("last "+last);
            if(first != last){
                return "no";
            }
        }
        return "yes";
    }
}
