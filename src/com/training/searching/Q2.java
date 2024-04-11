package com.training.searching;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int n = obj.nextInt();
        int P = (100/n);
        List<Character> list =  new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            list.add(obj.next().charAt(0));
        }
        for (Character c : list){
            if (map.containsKey(c)){
                int count = map.get(c);
                map.put(c,count + 1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);
        int pass = map.get('P');
        int result = pass*P;
        System.out.println(result);
        if(result > 25){
            System.out.println("Not Blacklisted");
        }else{
            System.out.println("Blacklisted");
        }

    }
}
