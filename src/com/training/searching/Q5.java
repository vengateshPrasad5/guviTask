package com.training.searching;

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        List<Integer> rollDice = new ArrayList<>();
        Map<Integer,Integer> diceMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            rollDice.add(obj.nextInt());
        }
        for(Integer i :  rollDice){
            if(diceMap.containsKey(i)){
                int count = diceMap.get(i);
                diceMap.put(i, count + 1);
            }else{
                diceMap.put(i,1);
            }
        }

        int result = 0;
        for(Map.Entry<Integer,Integer> m : diceMap.entrySet())
           if(m.getValue() == 1){
               result = m.getKey();
           }
        System.out.println(result);
    }
}
