package com.dsa.saurabh.level01.Array_CS;

import java.util.Arrays;

public class Array_Sort012 {

    private static void sort(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        for (int mid = 0; mid <= high; ) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }

    private static void swap(int[] arr, int low, int mid) {

        int temp = arr[low];
        arr[low] = arr[mid];
        arr[mid] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        sort(arr);
        Arrays.stream(arr).boxed().map(x -> x + " ").forEach(System.out::print);
    }
}
