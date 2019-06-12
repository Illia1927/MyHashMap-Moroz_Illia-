package com.practice.myHashMap;

public interface MyHashMap<K, V> {
    boolean put(K key, V value);

    V get(K key);

    int size();
}
