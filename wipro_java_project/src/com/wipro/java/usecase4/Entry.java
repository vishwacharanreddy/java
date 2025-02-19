package com.wipro.java.usecase4;

// Entry class to represent key-value pairs
class Entry<K, V> {
    K key;
    V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}