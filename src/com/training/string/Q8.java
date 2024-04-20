package com.training.string;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner obj  = new Scanner(System.in);
        String str  = obj.nextLine();
        int compute = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(str.charAt(i) == 'a' ||
            str.charAt(i) == 'e' ||
            str.charAt(i) == 'i' ||
            str.charAt(i) == 'o' ||
            str.charAt(i) == 'u'){
                compute = ch + compute;
            }
        }
        System.out.println(compute % 8 == 0 ? 1 : 0);
    }
}
