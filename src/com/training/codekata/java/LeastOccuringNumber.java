package com.training.codekata.java;

import java.util.*;

public class LeastOccuringNumber {
    public static void main(String[] args) {
//        Scanner obj = new Scanner(System.in);
//        int n = obj.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
        int[] arr = {76, 25, 7, 6, 6, 7};
        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            arr.add(obj.nextInt());
//        }
        ArrayList<Integer> leastOccurringNumber = new ArrayList<>();
        int leastOccurrences = 1;

        System.out.println(arr.length);
        for (int j = 0; j < arr.length; j++) {
            int c = arr[j];
            if (map.containsKey(c)) {
                int existCount = map.get(c);
                map.put(c, existCount + 1);
            } else {
                map.put(c, 1);
            }
        }
//       find and Set Least Occurrence
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() <= leastOccurrences) {
                leastOccurrences = entry.getValue();
            }

        }
//      Add least occurrence number
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == leastOccurrences) {
                leastOccurringNumber.add(entry.getKey());
            }

        }
//        Comparator<Object> val = ( o1,  o2) -> leastOccurringNumber.sort(o2 , o1,);
            System.out.println(map);
            leastOccurringNumber.sort(Collections.reverseOrder());

            for (int k = 0; k < leastOccurringNumber.size(); k++) {
                System.out.print(leastOccurringNumber.get(k));
                if(k < leastOccurringNumber.size() -1){
                    System.out.print("%");
                }
            }


    }
}
