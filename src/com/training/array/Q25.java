package com.training.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner obj  =  new Scanner(System.in);
        int num = obj.nextInt();
        List<Integer> list =  new ArrayList<>();
        while (num > 0){
            int lastNum = num % 10; // take last num
//            System.out.println("num "+num);
            if(lastNum %2 != 0){
                list.add(lastNum);
            }
            num = num/10; // remove the last num after checking the condition
        }
        if(list.isEmpty()){
            System.out.println(-1);
        } else {
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
                if(i < list.size()-1){
                    System.out.print(" ");
                }
            }
        }
    }
}
