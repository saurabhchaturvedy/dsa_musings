package com.dsa.saurabh.level01.Heaps_CS;

import java.util.PriorityQueue;

public class Heap_KthLargestFromStream {


    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public int add(int num, int k) {
        if (minHeap.size() < k) {
            minHeap.add(num);
            return minHeap.size() == k ? minHeap.peek() : -1;
        }

        if (num > minHeap.peek()) {
            minHeap.poll();
            minHeap.add(num);
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {

        Heap_KthLargestFromStream a = new Heap_KthLargestFromStream();

        int[] arr = new int[]{10, 7, 11, 5, 27, 8, 9, 45};
        int k = 3;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(a.add(arr[i], k)+" ");
        }

    }
}
