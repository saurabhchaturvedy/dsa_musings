package com.dsa.saurabh.level01.Sorting.MergeSort;

import java.util.Arrays;

public class MergeSort {


    private static int[] mergeSort(int[] A, int left, int right) {
        int[] mergedAndSortedArray = new int[A.length];
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(A, left, mid);
            mergeSort(A, mid + 1, right);
            mergedAndSortedArray = merge(A, left, mid, right);
        }
        return mergedAndSortedArray;
    }

    private static int[] merge(int[] A, int left, int mid, int right) {

        int B[] = new int[right + 1];
        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right) {
            if (A[i] < A[j]) {
                B[k++] = A[i++];
            } else {
                B[k++] = A[j++];
            }
        }

        while (i <= mid)
            B[k++] = A[i++];
        while (j <= right)
            B[k++] = A[j++];

        for (int m = left; m <= right; m++) {
            A[m] = B[m];
        }

        return A;
    }


    public static void main(String[] args) {

        int[] arr = {9, 6, 5, 0, 8, 2};
        Arrays.stream(mergeSort(arr, 0, arr.length - 1)).asLongStream().boxed().map(x -> x + " ").forEach(System.out::print);

    }
}
