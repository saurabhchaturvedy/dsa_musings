package com.dsa.saurabh.level01.Sorting.HeapSort;

import java.util.Arrays;

public class HeapSort {

    private int[] array;

    private void buildHeap(int[] array, int n) {
        for (int i = (n / 2 - 1); i >= 0; i--) {
            heapify(array, n, i);
        }
    }

    private void heapify(int[] array, int n, int i) {

        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        int large = i;

        if (leftChild < n && array[leftChild] > array[i]) {
            large = leftChild;
        }
        if (rightChild < n && array[rightChild] > array[large]) {
            large = rightChild;
        }

        if (large != i) {
            swap(large, i);
            heapify(array, n, large);
        }
    }

    private void swap(int large, int i) {

        int temp = array[i];
        array[i] = array[large];
        array[large] = temp;
    }

    private void heapSort(int[] array, int n) {
        buildHeap(array, n);
        for (int i = n - 1; i >= 0; i--) {
            swap(0, i);
            heapify(array, i, 0);
        }
    }


    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        heapSort.array = new int[]{2, 9, 7, 6, 5, 8};
        heapSort.buildHeap(heapSort.array, heapSort.array.length);
        heapSort.heapSort(heapSort.array, heapSort.array.length);
        Arrays.stream(heapSort.array).asLongStream().boxed().map(x -> x + " ").forEach(System.out::print);
    }
}
