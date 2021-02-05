package com.dsa.saurabh.level01.Heaps_CS;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_KthLargest {


    private int kthLargestMaxHeap(int[] array, int k) {
        if (array.length < k) {
            System.out.println("Invalid index");
            return -1;
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            priorityQueue.offer(array[i]);
        }

        for (int i = 0; i < k - 1; i++) {
            priorityQueue.poll();
        }

        return priorityQueue.peek();
    }

    private int kthLargestMinHeap(int[] array, int k) {
        if (array.length < k) {
            System.out.println("Invalid index");
            return -1;
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            priorityQueue.offer(array[i]);
        }

        for (int i = k; i < array.length; i++) {
            if (array[i] > priorityQueue.peek()) {
                priorityQueue.poll();
                priorityQueue.offer(array[i]);
            }
        }

        return priorityQueue.peek();
    }


    public static void main(String[] args) {

        int[] array = {2, 9, 3, 5, 27, 13, 44, 67, 32};
        Heap_KthLargest heap_kthLargest = new Heap_KthLargest();
        System.out.println(heap_kthLargest.kthLargestMaxHeap(array, 3));
        System.out.println(heap_kthLargest.kthLargestMinHeap(array, 3));
    }
}
