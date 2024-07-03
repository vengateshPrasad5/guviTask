package com.training.DesignPattern.BuilderDP;

public class Main {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setBattery(3000).setOs("Android").getPhone();
        System.out.println(phone);
    }
}
