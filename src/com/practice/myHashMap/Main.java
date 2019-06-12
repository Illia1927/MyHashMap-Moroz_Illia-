package com.practice.myHashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, Long> myHashMap = new MyHashMapImpl<>();
        myHashMap.put(1, 1L);
        myHashMap.put(2, 3L);
        myHashMap.put(3, 15L);
        myHashMap.put(4, 12314L);
        myHashMap.put(4, 11L);
        myHashMap.put(5, 1927L);
        System.out.println("Size is : " + myHashMap.size());
        System.out.println("Element is : " + myHashMap.get(1));
    }
}
