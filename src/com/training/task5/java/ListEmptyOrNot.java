package com.training.task5.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListEmptyOrNot {
    public static void main(String[] args) {
        List<String> listStrings = Arrays.asList("abc","","bc","efg","abcd","","jkl");
        System.out.println("Given String :"+listStrings);
//        Is Empty
        boolean isEmpty = listStrings.stream().anyMatch(x->x.isEmpty());
//        Filter empty strings
        List<String> withoutEmpty =listStrings.stream().filter(x-> !x.isEmpty()).collect(Collectors.toList());

        System.out.println("String Without empty string "+withoutEmpty);
        System.out.println("Is List has empty string : "+isEmpty);
    }
}
