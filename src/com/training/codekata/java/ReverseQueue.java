package com.training.codekata.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class ReverseQueue {
    /*
     You are given with a queue. Your task is to reverse the queue elements and print it.

    Input Description:
    You are given a number ‘n’,denoting size of queue, Next line contains s space separated numbers

    Output Description:
    Print the reversed queue.

    Sample Input :
    6
    1 2 3 4 5 6
    Sample Output :
    6 5 4 3 2 1
    */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        Stack<Integer> queue = new Stack<>();
        Queue<Integer> reverse_queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.push(obj.nextInt());
        }

        for (int i = 0; i < n; i++) {
//            remove the element and store in the array
            int temp = queue.pop();
//            push the element into the array
//            as it the stack the last value stored removed first and added
//            first into the reverse stack
            reverse_queue.add(temp);
        }
        // Print the reversed queue
        while (!reverse_queue.isEmpty()) {
            System.out.print(reverse_queue.poll()); // poll removes the head element
            if (!reverse_queue.isEmpty()) { // avoid space after last element
                System.out.print(" ");
            }
        }
    }
}
