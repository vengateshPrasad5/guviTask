package com.training.codekata.java;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringOrder {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        obj.nextLine();
        String[] arr_str=  new String[n];

        for (int i = 0; i < n; i++) {
            arr_str[i] = obj.next();
        }
        List<String> list= Arrays.stream(arr_str)
                .sorted((o1, o2) -> {
//                    It returns an integer value:
//                    -Negative if o1 should come before o2.
//                    -Positive if o1 should come after o2.
//                    -Zero if o1 and o2 are considered equal. will jump to compareTo() method to compare lexicographically
                    int len = Integer.compare(o1.length(),o2.length());
                    System.out.println(len);
                    if (len != 0) {
                        System.out.println(len);
                        return len;
                    } else {
                        System.out.println(o1.compareTo(o2));
//                        If the lengths of o1 and o2 are equal, return 0, we compare them lexicographically using the compareTo() method.
//                        his ensures that strings with the same length are sorted alphabetically.
                        return o1.compareTo(o2);
                    }
                } ).collect(Collectors.toList());

        for(int i=0; i < list.size() ; i++){
            System.out.print(list.get(i));
            if(i < list.size()-1){
                System.out.print(" ");
            }
        }

    }
}
