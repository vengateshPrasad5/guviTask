package com.training.string;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner obj  =  new Scanner(System.in);
        String word = obj.nextLine();
        String reverse = "";

        for (int i = 0; i < word.length(); i++) {
            reverse = word.charAt(i) + reverse;
        }
        System.out.println(reverse.substring(0,1).toUpperCase()+reverse.substring(1));
    }
}
