package com.training.dataStructure;

import java.util.Scanner;
import java.util.Stack;
import java.lang.String;
import java.lang.Character;

public class Q6 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        String str = obj.nextLine();
        System.out.println(isValidParenthesis(str) ? "yes" : "no");
    }
    static Boolean isValidParenthesis(String str){
        Stack<Character> stack =  new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if( currChar == '(' || currChar == '{' || currChar == '[' ){
              stack.push(currChar);
            }
            else{
                if (stack.empty()) {
                    return false;
                }
                char top = stack.pop();
//                Note '' represent character , "" represent string
                if ((top == '(' && currChar == ')') ||
                        (top == '{' && currChar == '}') ||
                        (top == '[' && currChar == ']')
                ) {
                    continue;
                } else {
                    return false;
                }
            }

        }
        return stack.empty(); // returns boolean true if stack empty or return false
    }
}
