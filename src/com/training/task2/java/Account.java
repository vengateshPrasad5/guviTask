package com.training.task2.java;

public class Account {
    public double balance;
    static double amount;
//   Constructor with two parameter
    public Account(double balance, double amount) {
        this.balance = balance;
        Account.amount = amount;
    }
//    Constructor with no parameter
    public Account() {
        System.out.println("Current Balance " + balance);
    }
    // Get Balance Method
    public String getBalance() {
        return String.format("%.2f",balance);
    }
// Withdraw method
    public double withDraw() {
        if(balance > amount){
            balance -= amount;
            System.out.println("Amount Withdraw "+ String.format("%.2f",amount));//Sample Amount Withdraw 2500.00
            return balance;
        } else {
            return -1;
        }
    }
//    Deposit method
    public double deposit( ) {
            balance += amount;
            System.out.println("Amount Deposited "+ String.format("%.2f",amount));//Sample Amount Deposited 2500.00
            return balance;
    }
}
