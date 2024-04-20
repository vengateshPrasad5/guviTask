package com.training.string;

import java.util.Scanner;
import java.util.Stack;

public class Q1 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        String str = obj.nextLine();
        Stack<Character> stack = new Stack<>();
        Boolean bool =  balancedOrNot(str, stack);

        System.out.println(bool ? 1 : 0);

    }

    private static Boolean balancedOrNot(String str, Stack<Character> stack) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '{' ||
               str.charAt(i) == '(' ||
               str.charAt(i) == '[' ){
               stack.add(str.charAt(i));
            } else {
                if(stack.isEmpty()) return false;
                if(stack.peek() == '{' && str.charAt(i) == '}' ||
                   stack.peek() == '(' && str.charAt(i) == ')' ||
                   stack.peek() == '[' && str.charAt(i) == ']' ){
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
