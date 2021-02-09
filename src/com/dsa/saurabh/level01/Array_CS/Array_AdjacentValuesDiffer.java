package com.dsa.saurabh.level01.Array_CS;

public class Array_AdjacentValuesDiffer {


    private static int findValueIndex(int[] arr, int value) {
        if (arr.length == 0) return -1;

        int start = 0;

        while (start < arr.length) {
            if (arr[start] == value) {
                return start;
            }
            int diff = Math.abs(arr[start] - value);
            start = start + diff;
        }

        return -1;
    }


    public static void main(String[] args) {
        int arr1[] = {7, 6, 7, 6, 7, 6, 5, 4, 5, 4, 3, 2, 1, 2, 3};
        int arr2[] = {2, 3, 2, 4, 5, 6, 7};
        System.out.println(findValueIndex(arr1, 2));
        System.out.println(findValueIndex(arr2, 5));
    }
}
