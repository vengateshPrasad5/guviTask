package com.training.task4;

class NotValidAgeException extends Exception {
    public NotValidAgeException(String message) {
        super(message);
    }
}
public class Voter {
    long voterId;
    String name;
    int age;

    @Override
    public String toString() {
        return "{" +
                "voterId=" + voterId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Voter(long voterId, String name, int age){
        ageValidation(age);
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    private static void ageValidation(int age){
        try {
            if ( age < 18) {
                throw new NotValidAgeException("invalid age for voter");
            } else{
                System.out.println("Voter Info Valid");
            }
        } catch (NotValidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
