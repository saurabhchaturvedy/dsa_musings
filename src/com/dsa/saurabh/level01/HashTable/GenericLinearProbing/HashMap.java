package com.dsa.saurabh.level01.HashTable.GenericLinearProbing;

public class HashMap<K, V> {


    private K[] keys;
    private V[] values;
    private int noOfItems;
    private int capacity;

    public HashMap() {
        this.keys = (K[]) new Object[Constants.MAP_CAPACITY];
        this.values = (V[]) new Object[Constants.MAP_CAPACITY];
        this.capacity = Constants.MAP_CAPACITY;
        this.noOfItems = 0;

    }

    public HashMap(int newCapacity) {
        this.keys = (K[]) new Object[Constants.MAP_CAPACITY];
        this.values = (V[]) new Object[Constants.MAP_CAPACITY];
        this.capacity = newCapacity;
        this.noOfItems = 0;

    }

    private int size() {
        return this.noOfItems;
    }

    private boolean isEmpty() {
        return this.noOfItems == 0;
    }


    private V get(K key) {
        if (key == null) return null;
        int index = hash(key);
        if (keys[index] == null) {
            throw new RuntimeException("No entry present !! ");
        }
        while (keys[index] != null) {
            if (keys[index].equals(key)) {
                return values[index];
            }

            index = (index + 1) % this.capacity;
        }
        return null;
    }

    private void put(K key, V value) {
        if (key == null || value == null) return;
        int index = hash(key);
        if (noOfItems >= capacity * 0.75) {
            resize(2 * capacity);
        }
        while (keys[index] != null) {
            if (keys[index].equals(key)) {
                values[index] = value;
                return;
            }

            index = (index + 1) % capacity;
        }
        keys[index] = key;
        values[index] = value;
        noOfItems++;
    }

    private void remove(K key, V value) {
        if (key == null) return;
        int index = hash(key);

        while (!keys[index].equals(key)) {
            index = (index + 1) % capacity;
        }

        keys[index] = null;
        values[index] = null;

        while (keys[index] != null) {
            K tempKey = keys[index];
            V tempValue = values[index];

            keys[index] = null;
            values[index] = null;

            noOfItems--;
            put(tempKey, tempValue);

            index = (index + 1) % capacity;
        }

        noOfItems--;

        if (noOfItems <= capacity / 3) {
            resize(capacity / 2);
        }
    }

    private void resize(int newCapacity) {
        HashMap<K, V> map = new HashMap<>(newCapacity);
        for (int i = 0; i < capacity; i++) {
            if (keys[i] != null) {
                map.put(keys[i], values[i]);
            }
        }

        keys = map.keys;
        values = map.values;
        capacity = map.capacity;

    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public static void main(String[] args) {

    }
}
