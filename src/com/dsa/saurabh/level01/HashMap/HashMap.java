package com.dsa.saurabh.level01.HashMap;

public class HashMap<K, V> {


    private EntryNode<K, V>[] entries;
    private int capacity = 4;

    private static class EntryNode<K, V> {
        private K key;
        private V value;
        private EntryNode<K, V> next;

        EntryNode(K key, V value, EntryNode<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    HashMap() {
        this.entries = new EntryNode[capacity];
    }

    private void put(K key, V data) {
        if (key == null)
            return;
        int hash = hash(key);

        EntryNode<K, V> newEntry = new EntryNode<>(key, data, null);

        if (entries[hash] == null) {
            entries[hash] = newEntry;
        } else {
            EntryNode<K, V> temp = entries[hash];

            while (temp != null) {
                if (temp.key.equals(key)) {
                    temp.value = data;
                }
                temp = temp.next;
            }
            temp.next = newEntry;
        }
    }

    private V get(K key) {
        int hash = hash(key);
        if (entries[hash] == null) {
            return null;
        } else {
            EntryNode<K, V> temp = entries[hash];
            while (temp != null) {
                if (temp.key.equals(key)) {
                    return temp.value;
                }
                temp = temp.next;
            }
        }
        return null;
    }

    private boolean remove(K key) {
        int hash = hash(key);
        if (entries[hash] == null) {
            return false;
        } else {
            EntryNode<K, V> temp = entries[hash];
            EntryNode<K, V> previous = null;
            while (temp != null) {
                if (temp.key.equals(key)) {
                    if (previous == null) {
                        entries[hash] = temp.next;
                    } else {
                        previous.next = temp.next;
                        return true;
                    }
                }
                previous = temp;
                temp = temp.next;
            }
        }
        return false;
    }

    private void show() {
        for (int i = 0; i < entries.length; i++) {
            EntryNode<K, V> temp = entries[i];
            while (temp != null) {
                System.out.print("{" + temp.key + " : " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }


    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(4, 400);

        map.remove(3);
        map.show();
        System.out.println();
        System.out.println(map.get(1));
    }

}
