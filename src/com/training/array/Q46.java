package com.training.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int item = obj.nextInt();
        int[] list = new int[item];
        for (int i = 0; i < item; i++) {
            list[i] = obj.nextInt();
        }
        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            if (i == list.length - 1) {
                System.out.print(list[i]);
            } else {
                System.out.print(list[i] + " ");
            }
        }
    }
}
