package com.training.parctice.java;

import java.util.Arrays;
import java.util.Scanner;

//delete at end , beginning
//insert at beginning
//get index
//update index ,val
//search val
class ArrayDemo{
    private int arr[];
    private int capacity;
    private int size;
    public ArrayDemo(){
        size=0;
        capacity = 8;
        arr = new int[capacity];
    }
    public void add(int val){
        if(size == capacity){
            expandArray();
        }
        arr[size] = val;
        size++;
    }
    private void expandArray(){
        capacity =  capacity * 2;
        arr = Arrays.copyOf(arr,capacity);
    }

    public void display(){
        System.out.print("Element in the list = ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void insertAtPos(int pos, int val){
       if(size == capacity){
           expandArray();
       }
        for (int i = size-1; i >=pos ; i--) {
            arr[i+1] =arr[i];
        }
        arr[pos] = val;
        size++;
    }

    public  void deleteAt(int pos){
        for (int i = pos; i < size ; i++) {
            arr[i] = arr[i+1];
        }
        size--;
        if(capacity > 3*size ){
            shrinkArray();
        }
    }
    private void shrinkArray(){
        capacity = capacity/2;
        arr = Arrays.copyOf(arr,capacity);
    }
}
public class DynamicArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int val, pos;
        ArrayDemo list =  new ArrayDemo();
        while(true) {
            System.out.println("1 Add Array");
            System.out.println("2 Display List");
            System.out.println("3 Insert at Position");
            System.out.println("4 Delete at Position");
            System.out.println("5 Exit");

            int choice = obj.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter value");
                    val = obj.nextInt();
                    list.add(val);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    System.out.println("Enter Position");
                    pos = obj.nextInt();
                    System.out.println("Enter Value");
                    val = obj.nextInt();
                    list.insertAtPos(pos,val);
                    break;
                case 4:
                    System.out.println("Enter Position");
                    pos = obj.nextInt();
                    list.deleteAt(pos);
                    break;
                case 5: System.exit(0);
                       break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }
}
