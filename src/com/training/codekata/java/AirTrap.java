package com.training.codekata.java;

public class AirTrap {
    public static void main(String[] args) {
        Integer [] col= {7,4,9};
        int res= 0;
        int lb = 0;
        int rb = 0 ;
        int at = 0;
        for (int i = 1; i <= col.length-2; i++) {
//            initialize result
//            set left bar
            lb = col[i];
            for (int j = 0; j < i ; j++) {
                if(col[j] > lb){
                    lb=col[j];
                }
            }
            rb = col[i];
            for (int j = i+1; j < col.length ; j++ ) {
                 if(col[j] > rb){
                     rb = col[j];
                 }
            }
            int al =  Math.min(lb,rb);
            at = al-col[i];
            res = res + at;
        }
        System.out.println(at);
    }
}
