package com.training.task2.java;

public class Person {

//    initialize name and age
    public String name = "Prasad";
    public int age =18;

    public Person(String name,int age){
        System.out.println("name before "+this.name);// Output : name before Prasad
        System.out.println("age before "+this.age); // Output : age before 18
        this.name =name;
        this.age = age;
    }
//    getter
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }



//    setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}