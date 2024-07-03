package com.training.DesignPattern.BuilderDP;

public class Phone {
    private String os;
    private Double screenSize;
    private int battery;
    private int ram;
    private String company;

    public Phone(String os, Double screenSize, int battery, int ram, String company) {
        this.os = os;
        this.screenSize = screenSize;
        this.battery = battery;
        this.ram = ram;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                ", ram=" + ram +
                ", company='" + company + '\'' +
                '}';
    }
}
