package com.training.parctice.java;

public class CClass implements  Cloneable{
    @Override
    public CClass clone() {
        try {
            return (CClass) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        CClass class1 = new CClass();
        CClass class2 = class1.clone();

        System.gc();
    }
}


