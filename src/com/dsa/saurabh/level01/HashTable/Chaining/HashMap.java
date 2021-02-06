package com.dsa.saurabh.level01.HashTable.Chaining;

import java.util.Arrays;

public class HashMap {

    private MapEntry[] entries;

    HashMap() {
        entries = new MapEntry[Constants.MAP_CAPACITY];
    }

    private int hash(int key) {
        return key % Constants.MAP_CAPACITY;
    }

    private void put(int key, int value) {
        int index = hash(key);

        if (entries[index] == null) {
            System.out.println("No collision situation...");
            entries[index] = new MapEntry(key, value);
        } else {
            System.out.println("Collision situation...");
            MapEntry temp = entries[index];
            while (temp.next != null) {

                temp = temp.next;

            }
            if (temp.key == key) {
                temp.value = value;
                return;
            }
            temp.next = new MapEntry(key, value);
        }
    }

    private int get(int key) {
        int index = hash(key);
        if (entries[index] == null) {
            throw new RuntimeException("Entry not found !!");
        } else {
            MapEntry temp = entries[index];
            while (temp != null) {
                if (temp.key == key) {
                    return temp.value;
                }
                temp = temp.next;
            }
        }
        throw new RuntimeException("Entry not found !!");
    }


    public void display() {

        for (int i = 0; i < entries.length; i++) {
            MapEntry temp = entries[i];
            while (temp != null) {
                System.out.print(temp.key + " <=> " + temp.value + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {

        HashMap map = new HashMap();
        map.put(5, 500);
        map.put(6, 300);
        map.put(7, 900);
        map.put(15, 65);
        map.put(15, 88);
        map.put(15, 194);
        map.put(20, 653);
        map.put(11, 933);
        map.put(5, 6677);

        map.display();

        System.out.println(map.get(15));

    }
}
