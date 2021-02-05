package com.dsa.saurabh.level01.Heaps_CS;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_PriorityQueue {


    private void minHeap(int[] array) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < array.length; i++) {
            priorityQueue.offer(array[i]);
            System.out.print(priorityQueue.peek() + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            priorityQueue.poll();
            System.out.print(priorityQueue.peek() + " ");
        }
        System.out.println();
    }

    private void maxHeap(int[] array) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < array.length; i++) {
            priorityQueue.offer(array[i]);
            System.out.print(priorityQueue.peek() + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            priorityQueue.poll();
            System.out.print(priorityQueue.peek() + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] array = {10, 7, 11, 5, 2, 13, 1, 45};
        Heap_PriorityQueue heap_priorityQueue = new Heap_PriorityQueue();
        heap_priorityQueue.minHeap(array);
        heap_priorityQueue.maxHeap(array);
    }
}
