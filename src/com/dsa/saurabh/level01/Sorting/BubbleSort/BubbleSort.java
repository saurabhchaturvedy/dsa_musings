package com.dsa.saurabh.level01.Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort {


    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {

        int[] arr = {9, 6, 5, 0, 8, 2};
        Arrays.stream(bubbleSort(arr)).asLongStream().boxed().map(x->x+" ").forEach(System.out::print);
    }
}
