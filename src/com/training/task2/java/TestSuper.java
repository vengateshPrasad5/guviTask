package com.training.task2.java;

public class TestSuper {
    //Update name and age using super method using constructor
    public static void main(String[] args) {
        Employee Emp = new Employee("Vengat",25,123,18500.24);
        System.out.println("Name After "+Emp.getName());//Output : Name After Vengat
        System.out.println("Age After"+Emp.getAge());//Output : Age After 25
    }
}
