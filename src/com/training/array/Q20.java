package com.training.array;


import java.util.*;

public class Q20 {
    public static void main(String[] args) {
        Scanner obj  =  new Scanner(System.in);
        String str = obj.nextLine();
        List<Character> digits = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            digits.add(str.charAt(i));
        }
        System.out.println(digits);
        for (int i = 0; i < digits.size()-1 ; i++) {
            if(digits.get(i).equals(digits.get(i+1))){
                digits.remove(i);
                digits.remove(i);
            }

        }

        StringBuilder sb = new StringBuilder();
        for(Character in : digits){
            sb.append(in);
        }
        System.out.println(sb);

    }
}
