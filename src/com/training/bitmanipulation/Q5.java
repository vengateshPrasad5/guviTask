package com.training.bitmanipulation;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner obj  =  new Scanner(System.in);
        int num = obj.nextInt();
        for (int i = 1; i <= num; i++) {
          String result  = decimalToBinary(i);
//          To provide the space after each result
          if(num % 2 == 0){
              System.out.print(result + " ");
          }
          if(num % 2 ==1){
              System.out.print(result);
                if(i < num ){
                    System.out.print(" ");
                }
          }
          System.out.println(binaryToDecimal(result));

        }
    }

    static String decimalToBinary(int num){
        String binary = "";
        while (num >= 1){
            int x = num % 2; // find the mod of num
            num = num / 2; // divide the num and update
            binary = x + binary; // adding the mod value to string
        }
        return binary;
    }

    static int binaryToDecimal(String b){
        int result  = 0;
        int powerOf2 = 1;
        for (int i = b.length()-1; i >= 0  ; i--) {
            if(b.charAt(i) == '1'){
                result = result + powerOf2;
            }
            powerOf2 *= 2;
        }
        return result;
    }
}
