package com.training.string;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        String sb = obj.nextLine();

        String result = sb.replaceAll("[aeiouAEIOU]","" );
//        for (int i = 0; i < sb.length(); i++) {
//            if(sb.toLowerCase().charAt(i) == 'a'  ||
//               sb.toLowerCase().charAt(i) == 'e'  ||
//               sb.toLowerCase().charAt(i) == 'i'  ||
//               sb.toLowerCase().charAt(i) == 'o'  ||
//               sb.toLowerCase().charAt(i) == 'u'){
//                sb.replace(sb.charAt(i) , '');
//            }
//        }

        System.out.println( result);
    }
}
