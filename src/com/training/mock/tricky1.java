package com.training.mock;

public class tricky1 {

    public static void main(String[] args) {
        foo(null);
       StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append("Number ").append(i).append(" , ");
        }
        String result = sb.toString();
        System.out.println("result = " + result);
    }
    public static void foo(Object o) {
        System.out.println("Object argument");
    }
//    public static void foo(String s) {
//        System.out.println("String argument");
//    }

    public static void foo(StringBuffer i){
        System.out.println("StringBuffer impl");
    }

}
