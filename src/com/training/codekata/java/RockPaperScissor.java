package com.training.codekata.java;

import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);

        String a = obj.next();
        String b = obj.next();

        if(a.equals("R") && b.equals("P")){
            System.out.println("P");
        } else if (a.equals("R") && b.equals("S")){
            System.out.println("R");
        } else if(a.equals("S") && b.equals("P")){
            System.out.println("S");
        } else {
            System.out.println("D");
        }
    }
}
