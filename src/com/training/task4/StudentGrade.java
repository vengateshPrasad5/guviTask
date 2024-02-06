package com.training.task4;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGrade {
    static Scanner obj =  new Scanner(System.in);
    static HashMap<String,Integer> studentWithGrades = new HashMap<>();
    public static void addStudents(){
        System.out.println("Enter Name");
        String name = obj.nextLine();
        System.out.println("Enter Grade");
        int grade = obj.nextInt();
        obj.nextLine();
        studentWithGrades.put(name,grade);
        System.out.println("Student Added");
        displayStudents();
    }
    public static void removeStudent(){
        System.out.println("Enter Name");
        String name = obj.nextLine();
        studentWithGrades.remove(name);
        System.out.println("Student Removed");
        displayStudents();
    }

    public static void displayStudents(){

        for(HashMap.Entry<String, Integer> list : studentWithGrades.entrySet()){
            System.out.println("Name : "+list.getKey()+" , Grade : "+list.getValue());
        }
    }
}
