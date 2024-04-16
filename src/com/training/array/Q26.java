package com.training.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int rows = obj.nextInt();
        int columns = obj.nextInt();
        int[][] table = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                table[i][j] = obj.nextInt();
            }
        }
        Arrays.sort(table, Comparator.comparingInt(a -> a[1]));

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(table[i][j]);
                if(j<columns-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
