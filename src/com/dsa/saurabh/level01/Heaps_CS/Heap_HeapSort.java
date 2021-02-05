package com.dsa.saurabh.level01.Heaps_CS;

import java.util.PriorityQueue;

public class Heap_HeapSort {


    private void heapSort(int[] array) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < array.length; i++) {
            priorityQueue.offer(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = priorityQueue.poll();
        }
    }


    public static void main(String[] args) {
        int[] array = {4, 1, 9, 11, 6, 23, 39, 29, 20};
        Heap_HeapSort heap_heapSort = new Heap_HeapSort();
        heap_heapSort.heapSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
