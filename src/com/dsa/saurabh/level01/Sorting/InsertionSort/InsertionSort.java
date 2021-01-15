package com.dsa.saurabh.level01.Sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSort {


    private static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 5, 0, 8, 2};
        Arrays.stream(insertionSort(arr)).asLongStream().boxed().map(x->x+" ").forEach(System.out::print);
    }
}
