package com.training.codekata.java;

import java.util.*;

public class LongestSubsequence {
    public static void main(String[] args) {
    /*  You are given an array.Your task is to print the length of longest consecutive subsequence.
         A longest consecutive subsequence is such that next element differ from previous by 1.

        Input Description:
        You are given with the length of array. Next line contains n space separated integers.

                Output Description:
        Print the length of longest consecutive subsequence.

                Sample Input :
        8
        1 6 5 3 2 4 10 12
        Sample Output :
        6
     */
        Scanner obj = new Scanner(System.in);
        int n =  obj.nextInt();
        obj.nextLine();
        String str = obj.nextLine();
        Set<Integer> set = new HashSet<>();
        int count = 0;
        int longest = 1;
//      String tokenizer used if the element has not the length of the size
        StringTokenizer st1 = new StringTokenizer(str, " ");
//      Adding number to the set based on the n
        while (st1.hasMoreTokens()) {
            set.add(Integer.parseInt(st1.nextToken()));
        }
//     Get individual integer
        for (int elem :set) {
//          If element does not have before element, set the element as
//          new element or initial element and count to 1
            if(!set.contains(elem-1)){
              int x = elem;
              count = 1;
//           If the element contains next element set x to next element
//           and increase count , until it has consecutive element in a set
              while (set.contains(x+1)){
                  x= x+1;
                  count = count+1;
              }
//            set the longest element and compare if the previous longest
//            is the maximum or set the newest count as max
              longest  = Math.max(longest , count);
            }
        }
        System.out.println("longest: " + longest);
    }
}
