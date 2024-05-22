package com.training.DailyByte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BirthdayParty {
    public static void main(String[] args) {
        List<Integer> appetite =  new ArrayList<>();
        List<Integer> cake =  new ArrayList<>();
        appetite.add(3);
//        appetite.add(4);
//        appetite.add(5);
//        cake.add(1);
        cake.add(2);
//        cake.add(3);
//       expected answer 3.
        int count = 0;        
        for (int i = 0; i < appetite.size(); i++) {
            for (int j = 0; j < cake.size(); j++) {
                if(Objects.equals(appetite.get(i), cake.get(j))){
                    appetite.remove(i);
                    count++;
                }
            }
        }
        System.out.println("count = " + count);
    }
}