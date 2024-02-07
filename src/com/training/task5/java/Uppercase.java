package com.training.task5.java;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Uppercase {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc","d","ef");

//        Convert into Uppercase
        List<String> result = names.map(x ->x.toUpperCase()).collect(Collectors.toList());
        System.out.println("Result : "+ result);
    }
}
