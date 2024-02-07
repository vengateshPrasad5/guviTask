package com.training.task5.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GiftStudent {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arav","Babu","Akbar","Praveen","Jim","Ash","John","Jess","Peter","Alex");
        System.out.println("Students list "+ names);
        System.out.println("Count "+names.size());
        // Filter students starts with "A"
        List<String> result = names.stream().filter(x->x.startsWith("A")).collect(Collectors.toList());
        System.out.println("Students names for gift "+result);
    }
}
