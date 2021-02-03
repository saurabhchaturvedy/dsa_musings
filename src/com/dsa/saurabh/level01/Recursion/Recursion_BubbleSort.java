package com.dsa.saurabh.level01.Recursion;

import java.util.stream.Stream;

public class Recursion_BubbleSort {


    private static void bubbleSort(int[] arr,int n) {
        if (n == 1) return;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                temp = arr[i + 1];
            }
        }

        bubbleSort(arr, n - 1);
    }


    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 4};
        bubbleSort(arr, arr.length);
        Stream.of(arr).forEach(System.out::print);
    }
}
