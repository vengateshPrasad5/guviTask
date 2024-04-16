package com.training.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        String str = obj.nextLine();
        String result = str.toLowerCase();
        int first  = 0;
        int middle = (str.length()-1) / 2;
        int last= str.length()-1;
        if(result.charAt(first) == 'a' && result.charAt(middle) == 'm' && result.charAt(last) == 'z'){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
