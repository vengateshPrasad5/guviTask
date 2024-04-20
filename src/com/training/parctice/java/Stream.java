package com.training.parctice.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> lastThree = numbers.stream()
//                .skip(Math.max(0, numbers.size() - 1))
                .skip(numbers.size()-3)
                .collect(Collectors.toList());

        int sum =  numbers.stream().reduce(0,Integer::sum );
        System.out.println(sum);
        System.out.println( numbers.size()-3);
        System.out.println("Last three elements: " + lastThree);
    }
}
