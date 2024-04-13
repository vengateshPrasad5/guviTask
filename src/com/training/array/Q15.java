package com.training.array;

import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        Scanner obj  = new Scanner(System.in);
        int n = obj.nextInt();
        List<Integer> nArr = new ArrayList<>();
        List<Integer> mArr = new ArrayList<>();
        Map<Integer,Integer> occurrenceMap = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nArr.add(obj.nextInt());
        }
        int m = obj.nextInt();
        for (int i = 0; i < m; i++) {
            mArr.add(obj.nextInt());
        }
        for (Integer in : nArr){
            if(occurrenceMap.containsKey(in)){
                int count = occurrenceMap.get(in);
                occurrenceMap.put(in, count + 1 );
            } else {
                occurrenceMap.put(in,1);
            }
        }

        for(Integer in : mArr){
            if(occurrenceMap.containsKey(in)){
              result.add(occurrenceMap.get(in).toString());
            }else {
              result.add("Not Present");
            }
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if(i < result.size() -1){
                System.out.print(" ");
            }
        }
    }
}
