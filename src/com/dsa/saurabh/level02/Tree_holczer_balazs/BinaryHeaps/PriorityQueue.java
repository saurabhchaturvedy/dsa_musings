package com.dsa.saurabh.level02.Tree_holczer_balazs.BinaryHeaps;

import java.util.Collections;
import java.util.Comparator;
import java.util.Queue;

public class PriorityQueue {

    public static void main(String[] args) {
        // Queue<Integer> heap = new java.util.PriorityQueue<>();  // MIN HEAP
        // Queue<Integer> heap = new java.util.PriorityQueue<>(Collections.reverseOrder());  // MAX HEAP
        Queue<Person> heap = new java.util.PriorityQueue<>(Comparator.comparing(Person::getName).reversed()); // MAX HEAP

        heap.add(new Person("Saurabh", 31));
        heap.add(new Person("Vikash", 37));
        heap.add(new Person("Mahesh", 64));
        heap.add(new Person("Mayank", 22));

        while (!heap.isEmpty()) {
            System.out.println(heap.poll());
        }
    }
}
