package com.training.codekata.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlphabeticallySorted {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int n = obj.nextInt();
        obj.nextLine();
        String str = obj.nextLine();
        String[] temp = str.split(" ");
        List<String> ordered= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ordered.add(temp[i]);
        }
        ordered.sort(String::compareTo);

        for (int i = 0; i < n; i++) {
            System.out.print(ordered.get(i));
            if(i < n-1){
                System.out.print(" ");
            }
        }
    }
}
