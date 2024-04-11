package com.training.searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int numOfStudents = obj.nextInt();
        int rameshMark = obj.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numOfStudents; i++) {
            list.add(obj.nextInt());
        }
        if(list.contains(rameshMark)){
            System.out.println("Mark Exists");
        }else {
            System.out.println("Mark Not Exists");
        }
    }
}
