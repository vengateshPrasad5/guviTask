package com.training.patterns.java;

import java.util.Arrays;
import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int n = obj.nextInt();
//Print the patter as first line in ascending order
// Second line in descending order if the given number is odd or even
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
//                Check given number is odd or even
              if( n%2 == 0){
//                  if even render this loop
                  if(!(i%2 == 0)){
                      System.out.print(Math.abs(i-j)+1);
                  }else {
                      System.out.print(j);
                  }
              } else {
//                  if odd render this loop
                  if(i%2 == 0 ){
                      System.out.print(Math.abs(i-j)+1);
                  }else {
                      System.out.print(j);
                  }
              }
            }
            System.out.println();
        }
    }
}
