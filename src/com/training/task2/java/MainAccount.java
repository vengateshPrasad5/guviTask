package com.training.task2.java;

import java.util.Scanner;

public class MainAccount {

    public static void main(String[] args) {
        Account account = new Account(); // Output : Balance 0.0
        Account account1 = new Account(15000,2500);
        Scanner obj = new Scanner(System.in);
        System.out.println("Please Enter any one Option");
        System.out.println("View Balance ----> 1");
        System.out.println("Withdraw     ----> 2");
        System.out.println("Deposit      ----> 3");
        int option = obj.nextInt(); // Sample Input 1 / 2 / 3/ or any number

        if(option == 1){
            System.out.println("Your Account Balance "+ account1.getBalance());//Sample Output : Your Account Balance 15000.00
        } else if (option == 2){
            double result = account1.withDraw();
            if(result == -1){
                System.out.println("Insufficient Balance"); // Sample output Insufficient Balance (when withdraw is greater than Balance)
            }else{
                System.out.println("Balance "+  String.format("%.2f",result)); //Sample Balance 12500.0
            }
        } else if (option == 3){
            double result = account1.deposit();
            System.out.println("Balance "+ String.format("%.2f",result)); //Sample Balance 17500.0
        } else{
            System.out.println("Incorrect Option"); //Sample Incorrect Option (if option is invalid)
        }
    }
}
