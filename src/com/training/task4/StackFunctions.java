package com.training.task4;

import java.util.Scanner;
import java.util.Stack;

public class StackFunctions {
    static Scanner obj =  new Scanner(System.in);
    static  Stack<Integer> data = new Stack<>();
    public static void main(String[] args) {
        StackFunctions sf = new StackFunctions();

        System.out.println(" 0 ---> Exit \n 1 ---> Push element \n 2 ---> Pop Element \n 3 ---> Check if Empty");
        int val;

        do {
            System.out.println("Enter Option");
            val = obj.nextInt();
            switch (val){
                case 1 : sf.add();
                    break;
                case 2 : sf.remove();
                    break;
                case 3: sf.isEmpty();
                    break;
                default:
                    System.out.println("Enter Value between 1-3");
            }
        }while ( val !=0);


    }
    public void add(){
        System.out.println("Enter Value to push");
        int value = obj.nextInt();
        data.push(value);
        System.out.println("Value Added");
        System.out.println(data);
    }
    public void remove(){
        data.pop();
        System.out.println("Value Removed");
        System.out.println(data);
    }
    public void isEmpty(){
        System.out.println("Is Stack Empty "+data.empty());
    }
}
