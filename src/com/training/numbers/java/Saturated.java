package com.training.numbers.java;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Saturated {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int digitCount = 0;
        Map<Integer,Integer>map = new HashMap<>();
        while (n !=0 ) {
            int tempDigit  = n%10;
            int count;
            if(map.containsKey(tempDigit)){
                count = map.get(tempDigit);
                map.put(tempDigit, count+1);
            } else {
                map.put(tempDigit,1);
            }
            n/=10;
        }
        System.out.println(map);
        System.out.println(map.size() == 2 ? "Saturated" : "Unsaturated");
    }
}
