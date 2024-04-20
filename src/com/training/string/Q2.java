package com.training.string;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        StringBuffer str =  new StringBuffer(obj.nextLine()) ;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                num +=  Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }

        System.out.println("Engine no "+num);
    }
}
