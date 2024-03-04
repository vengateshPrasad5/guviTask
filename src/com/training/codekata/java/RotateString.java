package com.training.codekata.java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//Write a program to rotate the given string by the given number of times.
//
//Input Description:
//String, rotation times
//
//Output Description:
//print the Rotated string
//
//Sample Input :
//hello 3
//Sample Output :
//llohe
public class RotateString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
//        get string and value in a single line and split using space
//        and store into string and int as below
        String str1  = obj.nextLine();
        String[] parts = str1.split(" ");
        String str = parts[0];
        StringBuilder sb= new StringBuilder();
        int n = Integer.parseInt(parts[1]);


        Deque<Character> char_deque= new ArrayDeque<>();
//      store each char in a deque
        for (char c : str.toCharArray()){
            char_deque.add(c);
        }
//      rotate based on the number received
        for (int i = 0; i < n; i++) {
              char_deque.addFirst(char_deque.removeLast());
        }
//      covert the que element back to string using string builder and output
        for (char c : char_deque){
            sb.append(c);
        }
        System.out.println(sb);
    }
}
