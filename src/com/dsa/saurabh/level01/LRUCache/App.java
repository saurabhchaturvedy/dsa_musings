package com.dsa.saurabh.level01.LRUCache;

public class App {

    public static void main(String[] args) {

        LRUCache cache = new LRUCache();

        cache.put(0, "A");
        cache.put(1, "B");
        cache.put(2, "C");
        cache.put(3, "D");
        cache.put(4, "E");
        cache.put(5, "F");

        Node node = cache.get(3);
        System.out.println(node);
        cache.show();
        System.out.println();

        System.out.println(cache.get(5));
        cache.show();
        System.out.println();

        System.out.println(cache.get(1));
        cache.show();
        System.out.println();

    }
}
