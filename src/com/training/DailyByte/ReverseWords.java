package com.training.DailyByte;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
        String str =  "The Daily Byte";
        
        String[] stringList = str.split(" ");

        int count = 0;
        String[] reverseString = new String[stringList.length];
        for (int i =0 ; i < stringList.length; i++) {
            reverseString[i] = stringList[stringList.length-i-1];
        }
        for(String s : reverseString){
            System.out.print(s+" ");
        }
    }
}
