package com.training.parctice.java;

public class Demo {
    public static void main(String[] args) {
        LinkedList list =  new LinkedList();

        java.util.LinkedList<Integer> list1 = new java.util.LinkedList<>();

        // Add at beginning
        list.insertAtBeginning(8);
        list.insertAtBeginning(5);
        list.insertAtBeginning(3);
        list.insertAtBeginning(6);
        list.insertAtBeginning(7);
        list.display();
        System.out.println();

//        // Insert at any position
//        list.insertAtPos(0,10);

//        list.deleteAtPos(2);
//        list.deleteAtFirst();
        list.insertAtEnd(11);
        list.display();
        System.gc();
        System.out.println();
//        System.out.println(list.get(7));
//        list.updateAtPos(2,21);
//        list.deleteAtLast();
//        System.out.println(list.search(22));
        System.out.println(list.contains(5));
        list.display();
    }
}
