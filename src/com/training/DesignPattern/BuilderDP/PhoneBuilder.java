package com.training.DesignPattern.BuilderDP;

public class PhoneBuilder {
    private String os;
    private Double screenSize;
    private int battery;
    private int ram;
    private String company;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os,screenSize,battery,ram,company);
    }
}
