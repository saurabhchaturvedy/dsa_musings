package com.dsa.saurabh.level01.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort {


    private static int[] selectionSort(int[] arr) {
        int min_index = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            min_index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        return arr;

    }


    public static void main(String[] args) {

        int[] arr = {9, 6, 5, 0, 8, 2};
        Arrays.stream(selectionSort(arr)).asLongStream().boxed().map(x -> x + " ").forEach(System.out::print);
    }
}
