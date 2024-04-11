package com.training.searching;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int rows = obj.nextInt();
        int columns = obj.nextInt();
        int[][] prison = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                prison[i][j] = obj.nextInt();
            }
        }
        int suspectNumber = obj.nextInt();
        String result = "no";
        for (int k = 0; k < rows; k++) {
            for (int l = 0; l < columns; l++) {
                int num = prison[k][l];
                if (num == suspectNumber) {
                    result = "yes";
                    break;
                }
            }
        }
            System.out.println(result);
    }
}
