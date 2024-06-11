package com.training.Leetcode;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String result  = longestCommonPrefix(strs);
        System.out.println("result = " + result);
    }

    public static String longestCommonPrefix(String[] strs) {
       String result = "";
       int currIndex = 0;
       if(strs.length == 1){
         return strs[0];
       }
       while(true){
           for (int i = 1; i < strs.length-1; i++) {
               if(currIndex >= strs[i].length()|| currIndex >= strs[i+1].length() ||
                  strs[i].charAt(currIndex) != strs[i+1].charAt(currIndex) ){
                   return result;
               }
               result = result + strs[0].charAt(currIndex);
               currIndex++;
           }
       }
    }
}
