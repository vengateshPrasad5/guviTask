package com.training.Leetcode;

import java.util.HashMap;

public class LRUCache {
    private Node head,tail;
    private HashMap<Integer, Node> map =  new HashMap<>();
    private int capacity;

    public int get (int key){
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        } else {
            return -1;
        }
    }
    public void put(int key, int value){
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size() == capacity){
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }
    void remove(Node node){
        map.remove(node);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    void insert(Node node){
        map.put(node.key,node);
        Node nextHead = node;
        head.next = node;
        node.prev = head;
        nextHead.prev = node;
        node.next = nextHead;
    }
    public LRUCache(int capacity){
       this.capacity = capacity;
       head = new Node(0,0);
       tail=new Node(0,0);
       head.next = tail;
       tail.prev = head;
    }
    public static void main(String[] args) {
        LRUCache lruCache1 = new LRUCache(2);
        HashMap<Integer,Integer> lruCache = new HashMap<>();
        lruCache.put(1, 1); // cache is {1=1}
        lruCache.put(2, 2); // cache is {1=1, 2=2}
        System.out.println(lruCache.get(1)); // returns 1
        lruCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println(lruCache.get(2)); // returns -1 (not found)
        lruCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        System.out.println(lruCache.get(1)); // returns -1 (not found)
        System.out.println(lruCache.get(3)); // returns 3
        System.out.println(lruCache.get(4)); // returns 4
    }

    class Node {
        Node prev, next;
        int key,value;
        Node(int key, int value){
            this.key = key;
            this.value= value;
        }
    }
}
