package com.training.string;

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
       Scanner obj =  new Scanner(System.in);

       StringTokenizer st = new StringTokenizer(obj.nextLine());

       Stack<String> stack = new Stack<>();
       String sb = "";
        while (st.hasMoreTokens()){
            String str = st.nextToken();
            if(!stack.empty() && Objects.equals(stack.peek(), str)){
                stack.pop();
            }else {
                stack.add(str);
            }
        }

         for (String stt : stack){
             sb= sb + " " + stt;
         }
        System.out.println(sb.trim());
    }
}
