package com.training.searching;

import java.util.*;

public class Q17 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int n = obj.nextInt();
        List<Integer> list = new ArrayList<>();
        Stack<Integer> leader = new Stack<>();

        for (int i = 0; i < n; i++) {
            list.add(obj.nextInt());
        }

        for (int i = n-1; i >= 0 ; i--) {
            int currLeader = list.get(i);
            if( leader.empty() || currLeader > leader.peek() ){
                leader.push(currLeader);
            }
        }


        while(!leader.empty()){
            System.out.print(leader.pop());
            if( leader.iterator().hasNext()){
                System.out.print(" ");
            }
        }



    }
}
