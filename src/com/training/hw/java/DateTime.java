package com.training.hw.java;

import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) {
        datetime();
    }

    private static void datetime() {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date Time "+ dateTime);
    }
}
