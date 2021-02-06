package com.dsa.saurabh.level01.HashTable.Chaining;

public class MapEntry {

    int key;
    int value;

    MapEntry next;

    public MapEntry(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
