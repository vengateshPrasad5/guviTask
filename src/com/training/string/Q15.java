package com.training.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q15 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(obj.nextLine());
        String matchWord = obj.nextLine();
        int result = -1;
        Map<String,Integer> map = new HashMap<>();

        while (st.hasMoreTokens()){
            String str = st.nextToken();
            if(map.containsKey(str)){
                int count = map.get(str);
                map.put(str,count+1);
            }else{
                map.put(str,1);
            }
        }
        for(Map.Entry<String,Integer> set : map.entrySet()){
           if (set.getKey().equals(matchWord)){
               result = set.getValue();
               break;
           }
        }
        System.out.println(result);
    }
}
