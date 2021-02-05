package com.dsa.saurabh.level01.Heaps_CS;

import java.util.Arrays;

public class Heap_MaxHeap {

    int size = 0;
    int[] heap = new int[3];


    private void insert(int value) {
        if (size == heap.length - 1) {
            resize(2 * size);
        }
        heap[size] = value;
        int index = size;
        int parent = (index - 1) / 2;

        while (index > 0 && heap[parent] < heap[index]) {
            int temp = heap[parent];
            heap[parent] = heap[index];
            heap[index] = temp;

            temp = parent;
            index = parent;
            parent = (index - 1) / 2;
        }

        size++;
    }

    private void resize(int newCapacity) {

        heap = Arrays.copyOf(heap, newCapacity);
    }


    private int peek() {
        return this.heap[0];
    }

    private int poll() {
        int max = this.heap[0];
        this.heap[0] = this.heap[size - 1];
        heapifyMax(0);
        return max;
    }

    private void heapifyMax(int index) {

        int left = 2 * index + 1;
        int right = 2 * index + 2;

        int largest = index;

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != index) {
            int temp = heap[largest];
            heap[largest] = heap[index];
            heap[index] = temp;
            heapifyMax(largest);
        }
    }


    private void buildHeap(int[] array) {
        this.heap = array;
        this.size = array.length;
        for (int i = (size / 2 - 1); i >= 0; i--) {
            heapifyMax(i);
        }
    }


    public static void main(String[] args) {
        int[] arr = {10, 7, 11, 30, 76, 38, 2, 45};
        Heap_MaxHeap heap_maxHeap = new Heap_MaxHeap();
        heap_maxHeap.insert(arr[0]);
        heap_maxHeap.insert(arr[1]);
        heap_maxHeap.insert(arr[2]);
        heap_maxHeap.insert(arr[3]);

        System.out.println("max value is : " + heap_maxHeap.peek());

        heap_maxHeap.poll();

        System.out.println("max value is : " + heap_maxHeap.peek());

        heap_maxHeap.buildHeap(arr);

        System.out.println("max value is : " + heap_maxHeap.peek());
    }
}

