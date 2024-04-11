package com.training.searching;

import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int n = obj.nextInt();
        List<Integer> years = new ArrayList<>();
        List<String> party = new ArrayList<>();
        HashMap<Integer,String> map =  new HashMap<>();
        for (int i = 0; i < n ; i++) {
            years.add(obj.nextInt());
        }
        for (int i = 0; i < n; i++) {
            party.add(obj.next());
        }

        for (int i = 0 ; i < n ; i++) {
             map.put(years.get(i),party.get(i));
        }
        TreeMap<Integer,String> treeMap =  new TreeMap<>(map);
        System.out.println(treeMap);
        List<Integer> changeYear = new ArrayList<>();
        String val = treeMap.firstEntry().getValue();
        for(Map.Entry<Integer,String> set : treeMap.entrySet()){
            String instanceVal = set.getValue();
            if(!val.equals(instanceVal)){
                changeYear.add(set.getKey());
                val = set.getValue();
            }
        }
        for (Integer in : changeYear)
          System.out.println(in);

    }
}
//
//        Input:
//        6
//        1980 2005 1990 1985 1995 2000
//        KRR BSP BSP BSP KRR KRR