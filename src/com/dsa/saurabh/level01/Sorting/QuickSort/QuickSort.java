package com.dsa.saurabh.level01.Sorting.QuickSort;

import java.util.Arrays;

public class QuickSort {

    private int[] array;


    private void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(array, left, right);
            quickSort(array, left, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, right);
        }
    }

    private int partition(int[] array, int left, int right) {

        int pivot = array[0];
        int i = right + 1;
        for (int j = right; j > left; j--) {
            if (array[j] > pivot) {
                i--;
                swap(i, j);
            }
        }
        swap(i - 1, left);
        return (i - 1);
    }

    private void swap(int i, int j) {

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        quickSort.array = new int[]{9, 6, 5, 0, 8, 2};
        quickSort.quickSort(quickSort.array, 0, quickSort.array.length - 1);
        Arrays.stream(quickSort.array).asLongStream().boxed().map(x -> x + " ").forEach(System.out::print);
    }
}
