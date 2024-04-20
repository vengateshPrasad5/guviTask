package com.training.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        String str = obj.nextLine();

        Map<Character,Integer> map = new HashMap<>();
        String withoutDuplicate = "";
        for (int i = 0; i < str.length(); i++) {
            if(! map.containsKey(str.charAt(i))){
                withoutDuplicate = withoutDuplicate + str.charAt(i);
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(withoutDuplicate.length() == 3 ? "Wonder" : -1);
    }
}
