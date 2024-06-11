package com.training.Leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class LongestSubstringPalindrome {
    public static void main(String[] args) {
        String s = "cbba";
        String result =  longestPalindrome(s);
        System.out.println("result = " + result);
    }
        public static String longestPalindrome(String s) {
            int start = 0;
            int end = s.length() - 1;
            Deque<Character> deque = new ArrayDeque<>();
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                deque.add(s.charAt(i));
            }
            if (s.length() == 1)
                return s;
            if(s.length() == 2 && s.charAt(0) != s.charAt(1))
                return str.append(s.charAt(0)).toString();
            for (int i = 0 ; i < s.length() ; i++) {
                char sc = s.charAt(start);
                char ec = s.charAt(end);
                if (sc == ec) {
                    continue;
                } else {
                    deque.remove(sc);
                    deque.remove(ec);
                }
                start++;
                end--;
            }
            for (char c : deque) {
                str.append(c);
            }
            return str.toString();
        }

}
