package com.dsa.saurabh.level01.HashTable.LinearProbing;

public class HashMap {

    private MapEntry[] entries;


    private int hash(int key) {
        return key % Constants.MAP_CAPACITY;
    }

    HashMap() {
        entries = new MapEntry[Constants.MAP_CAPACITY];
    }


    private void put(int key, int value) {
        int index = hash(key);

        while (entries[index] != null) {
            index = (index + 1) % Constants.MAP_CAPACITY;
        }

        entries[index] = new MapEntry(key, value);
    }

    private int get(int key) {
        int index = hash(key);

        while (entries[index] != null && entries[index].key != key) {
            index = (index + 1) % Constants.MAP_CAPACITY;
        }

        if (entries[index] == null) {
            throw new RuntimeException("Entry not found !!");
        }

        return entries[index].value;
    }

    public static void main(String[] args) {

        HashMap map = new HashMap();
        map.put(5, 10);
        map.put(6, 130);

        System.out.println(map.get(6));
    }
}
