package com.training.task1.java;

import java.util.Scanner;

public class ReverseNumber {
    public static void main (String[] args){
        //        Enter input value

        System.out.println("Enter Number: ");
        Scanner obj  = new Scanner(System.in);
        int numberToReverse = obj.nextInt();
        int num1 =  numberToReverse;
        int reverseNumber = 0; //if not intialize error spotted and require a number as we multiply is done on line 16 for iteration 1
        Boolean result = false;
        while (numberToReverse > 0){
            int num = numberToReverse % 10; // gets the last number
//            System.out.println("step 1 : " + num);
            reverseNumber = reverseNumber * 10 + num; // multiple the number first digit with 10 and add the last number
//            System.out.println("step 2 : "+ reverseNumber);
            numberToReverse /= 10; // removes the last number
//            System.out.println("step 3 : "+ numberToReverse);
        }
        if(num1 == reverseNumber){
            result = true;
        }
        System.out.println("result = " + result);
        System.out.println("The Reverse Number : "+ reverseNumber);
    }
}
