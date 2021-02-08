package com.dsa.saurabh.level01.Array_CS;

public class Array_MergeSort {


    public static void main(String[] args) {
        int[] array = {9, 4, 13, 7, 8, 15};
        mergeSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void mergeSort(int[] array, int low, int high) {


        if (low != high) {
            int mid = (low + high) >> 1;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[high - low + 1];

        while ((i <= mid) && (j <= high)) {
            if (array[i] < array[j])
                temp[k++] = array[i++];
            if (array[j] < array[i])
                temp[k++] = array[j++];

        }

        while (i <= mid)
            temp[k++] = array[i++];
        while (j <= high)
            temp[k++] = array[j++];

        for (int m = low; m <= high; m++)
            array[m] = temp[m - low];
    }
}
