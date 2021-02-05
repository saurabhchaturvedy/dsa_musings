package com.dsa.saurabh.level01.Heaps_CS;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_KthSmallestFromStream {

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public int add(int num, int k) {
        if (maxHeap.size() < k) {
            maxHeap.add(num);
            return maxHeap.size() == k ? maxHeap.peek() : -1;
        }

        if (num < maxHeap.peek()) {
            maxHeap.poll();
            maxHeap.add(num);
        }

        return maxHeap.peek();
    }

    public static void main(String[] args) {
        Heap_KthSmallestFromStream a = new Heap_KthSmallestFromStream();

        int[] arr = new int[]{10, 7, 11, 5, 27, 3, 2, 1};
        int k = 3;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(a.add(arr[i], k));
        }

    }
}
