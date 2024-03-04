package com.training.codekata.java;
import java.util.ArrayDeque;
import java.util.Deque;

class Palindrome {
    public static boolean isPalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        // Initializing the deque
        for (Character c: input.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("rotator"));
        System.out.println(isPalindrome("prasad"));
    }
}

