package com.dsa.saurabh.level02.Tree_holczer_balazs.BinaryHeaps;

import java.util.Arrays;

public class Heap {

    private int[] heap;

    private int heapSize;

    public Heap(int capacity) {
        this.heap = new int[capacity];
        this.heapSize = 0;
    }

    private void insert(int item) {
        if (isFull()) {
            resize(2 * this.heap.length);
        }

        heap[heapSize] = item;
        heapSize++;
        fixUp(heapSize - 1);
    }

    private void fixUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && heap[parentIndex] < heap[index]) {
            swap(index, parentIndex);
            fixUp(parentIndex);
        }
    }

    private void swap(int index, int parentIndex) {

        int temp = heap[index];
        heap[index] = heap[parentIndex];
        heap[parentIndex] = temp;
    }

    private void resize(int capacity) {
        heap = Arrays.copyOf(heap, capacity);
    }


    private boolean isFull() {
        return heapSize == heap.length;
    }

    private int getMax() {
        return heap[0];
    }

    private int poll() {
        int max = getMax();
        swap(0, heapSize - 1);
        heapSize--;
        fixDown(0);
        return max;
    }

    private void fixDown(int index) {

        int leftIndex = 2 * index + 1;
        int rightIndex = 2 * index + 2;

        int largestItemIndex = index;

        if (leftIndex < heapSize && heap[leftIndex] > heap[index]) {
            largestItemIndex = leftIndex;
        }

        if (rightIndex < heapSize && heap[rightIndex] > heap[largestItemIndex]) {
            largestItemIndex = rightIndex;
        }

        if (largestItemIndex != index) {
            swap(index, largestItemIndex);
            fixDown(largestItemIndex);
        }
    }

    private void sort() {
        int n = heapSize;
        System.out.print("Sorted heap : ");
        for (int i = 0; i < n; i++) {
            int max = poll();
            System.out.print(max + " ");
        }
        System.out.println();
    }

    private void display() {
        for (int i = 0; i < heapSize; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Heap heap = new Heap(5);
        heap.insert(12);
        heap.insert(8);
        heap.insert(22);
        heap.insert(17);
        heap.insert(19);

        heap.display();

        System.out.println("max then " + heap.getMax());

        System.out.println(heap.poll());

        heap.display();

        System.out.println("max now " + heap.getMax());

        System.out.println();
        heap.sort();
    }
}
