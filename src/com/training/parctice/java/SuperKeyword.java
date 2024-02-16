package com.training.parctice.java;

import java.util.*;
import java.io.*;

class BiCycle{
    String define_me(){
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle{
    String define_me(){
        return "a cycle with an engine.";
    }


    MotorCycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me());

//        Solution : Using super keyword we can call the method from the extends class
//        below line we can call the method using in bicycle instead of declared in local class
        String temp = super.define_me(); //Fix this line

        System.out.println("My ancestor is a cycle who is "+ temp );
    }

}
class Solution{
    public static void main(String []args){
        MotorCycle M=new MotorCycle();
    }
}

