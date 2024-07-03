package com.training.parctice.java;

// Note: When adding node to the list, see the head is empty if not
// assign the head node the next first and add the new element so that
// we can have the prev address not being lost/ in this case overwrite

// insert at end done
// get(index) done
// update(index,val) done
// delete at end done
// search(val) done
// contains(val) done
public class LinkedList {
    Node head;
    class Node {
        // Stores the data
        int data;
        // Store the reference data for the next pointer
        Node next;
        // Creating new node
        Node(int val){
            data = val;
            next = null;
        }
    }
    LinkedList(){
        head = null;
    }
    public void insertAtBeginning(int val){
        Node newNode = new Node(val);
        if(head == null){
        // If head is empty/null
            head = newNode;
        }else {
        // If data already present then assign the
        // existing node to head first and add the new node to the list
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtEnd(int val){
        Node newnode = new Node(val);
        if (head == null){
           head = newnode;
        }else {
            Node temp = head;
            while (temp.next != null){ // get the last element
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void display(){
        Node temp = head; // to create temp so that not to lose the head node reference
        while (temp != null){ // until node is reaches last
            System.out.print(temp.data+" "); // print the data
            temp = temp.next; // jump to next node
        }
    }

    public int search(int val){
        Node temp = head;
        int index = 0;
        while (temp != null){
            if(temp.data == val){
                return index ;
            }
            temp = temp.next;
            index++;
        } return -1;
    }

    public boolean contains(int val){
        int result = search(val);
        if(result >= 0 ){
            return true;
        }
        return false;
    }
    public Integer get(int pos){
        Node temp = head;
        for (int i = 1; i <= pos; i++) {
            if(temp == null){
                throw new IndexOutOfBoundsException("Index not found "+ pos);
            }
            temp = temp.next;
        }
        return temp.data;
    }

    public void updateAtPos(int pos, int val){
        if(pos == 0 ){
            head.data = val;
            return;
        }
        Node temp  = head;
        for (int i = 1; i <= pos ; i++) {
            if(temp.next == null){
                throw new IndexOutOfBoundsException("Index not found "+pos);
            }
            temp = temp.next;
        }
        temp.data = val;
    }
    public void insertAtPos(int pos, int val){
        if(pos == 0){
            insertAtBeginning(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 1; i < pos ; i++) {
            temp = temp.next;
            if(temp == null){ // when node reaches end but user wants to insert beyond that
                throw new IllegalArgumentException("Invalid Position " + pos);
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Note: When pointer reassign the node link will be removed and
    // will be taken care of garbage collection to remove the element from the list
    public void deleteAtPos(int pos){
        if(pos == 0){
            deleteAtFirst();
            return;
        }

        Node temp  = head;
        Node prev = null;
        // Jump to the delete position
        for (int i = 1; i <= pos; i++) {
            if(temp == null){
                throw new IndexOutOfBoundsException("Deletion attempt on empty list");
            }
            prev =  temp; // get prev element
            temp = temp.next; // get delete element
        }
        prev.next = temp.next; // reassign the pointer
    }

    public void deleteAtFirst(){
        head =  head.next;
    }

    public void deleteAtLast(){
        Node temp = head;
        Node prev = null;
        while (temp.next != null){
             prev = temp;
             temp = temp.next;
        }
        prev.next = null;
    }
}
