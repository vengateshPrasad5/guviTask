package com.training.task4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WeekDays extends ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        List<String> weekDays = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        Scanner obj = new Scanner(System.in);
        System.out.println("10 ---> Exit");
        int dayIndex;
        do {
            System.out.println("Enter Day Position");
            dayIndex = obj.nextInt();
            try {
                if (dayIndex > 6 || dayIndex < 0) {
                    throw new ArrayIndexOutOfBoundsException("Please enter value between 0-6");
                } else {
                    System.out.println("Day Name is " + weekDays.get(dayIndex));
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error " + e.getMessage());
            }
        } while (dayIndex != 10);

    }
}
