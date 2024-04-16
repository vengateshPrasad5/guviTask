package com.training.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q24 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        obj.nextLine();
        StringTokenizer st = new StringTokenizer(obj.nextLine());
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        while (st.hasMoreTokens()){
           arr.add(st.nextToken());
        }
        for (String str : arr){
            if(! result.contains(str)){
                result.add(str);
            }
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if( i < result.size()-1){
                System.out.print(" ");
            }

        }
    }
}
