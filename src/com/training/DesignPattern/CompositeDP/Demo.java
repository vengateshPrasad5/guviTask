package com.training.DesignPattern.CompositeDP;

public class Demo {
    public static void main(String[] args) {

        Leaf mouse = new Leaf("Mouse",200);
        Leaf keyboard = new Leaf("Keyboard",500);
        Leaf monitor = new Leaf("Monitor",8000);
        Leaf hdd = new Leaf("HDD",4000);
        Leaf mb = new Leaf("mb",15000);
        Leaf ram =  new Leaf("ram",2000);

        Composite acc = new Composite("acc");
        acc.addComponent(mouse);
        acc.addComponent(monitor);
        acc.addComponent(keyboard);

        Composite cabinet = new Composite("Cabinet");
        cabinet.addComponent(mb);
        cabinet.addComponent(ram);

        Composite computer = new Composite("Computer");
        computer.addComponent(acc); // composite
        computer.addComponent(cabinet); // composite
        computer.addComponent(hdd); //leaf

        cabinet.showPrice();

    }
}
