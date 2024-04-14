package com.training.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner obj  =  new Scanner(System.in);
        int arrSize = obj.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < arrSize; i++) {
            list.add(obj.nextInt());
        }
        List<Integer> last3Items = list.subList(Math.max(list.size() - 3, 0), list.size());

        int compute = 0;
        for(Integer inn : last3Items){
            compute = inn + compute;
        }
        for(Integer in  : list){
            int result = in - compute;
            results.add(result);
        }

        for (Integer res : results){
            System.out.print(res);
            if(!results.get(arrSize-1).equals(res)){
                System.out.print(" ");
            }
        }
    }
}
