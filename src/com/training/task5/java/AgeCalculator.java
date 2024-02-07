package com.training.task5.java;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your birthdate (yyyy-mm-dd)");
        String date = obj.nextLine();
//        Convert String into date format
        LocalDate dob = LocalDate.parse(date);
//        Get Current Date
        LocalDate currentDate = LocalDate.now();
//        Calculate Difference
        Period result = Period.between(dob,currentDate);

        System.out.println("Your age is "+result.getYears()+" years "+result.getMonths()+" months "+result.getDays()+" days");
    }
}
