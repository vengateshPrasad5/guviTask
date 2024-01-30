package com.training.task2.java;

public class DisplayPerson extends Person {
    public DisplayPerson(String name, int age) {
        super(name, age);
    }
    public static void main (String[] args){
        Person person  = new Person("Franky",18);
// get default name and age
        System.out.println("Before initialize "+person.getName());// Output : Prasad
        System.out.println("Before initialize " + person.getAge());// Output : 18

// set name and age
        person.setName("Vengatesh");
        person.setAge(23);

// get name and age after initialized
        System.out.println("After initialize "+person.getName());// Output : Vengatesh
        System.out.println("After initialize " + person.getAge());// Output : 23

    }
}
