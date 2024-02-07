package com.training.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class AgeNotWithinRangeException extends Exception{
    public AgeNotWithinRangeException(String message){
        super(message);
    }
}
public class Student extends Exception {
    int rollNos;
    String name;
    int age;
    String course;
    @Override
    public String toString() {
        return "{" +
                "rollNos=" + rollNos +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }

    public Student(int rollNos, String name, int age, String course){
        nameValidator(name);
        ageValidator(age);
        this.rollNos = rollNos;
        this.name = name;
        this.course = course;
        this.age = age;
    }

    private static void nameValidator(String name)  {
        //       Name Exception Handling
        try {
            Pattern pattern = Pattern.compile("^[A-Za-z]+");
            Matcher matcher = pattern.matcher(name);
            if (!matcher.matches()) {
                throw new NameNotValidException("Name contains Special characters");
            }
        } catch (NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
    private static void ageValidator(int age)  {
        //       Age Exception Handling
        try {
            if (!( 15 < age &&  age < 21)) {
                throw new AgeNotWithinRangeException("Age is not between 15 and 21");
            }
        } catch (AgeNotWithinRangeException e) {
            System.out.println(e.getMessage());
        }
    }

}
