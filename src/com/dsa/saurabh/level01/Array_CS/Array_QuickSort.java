package com.dsa.saurabh.level01.Array_CS;
//22
public class Array_QuickSort {


    public static void main(String[] args) {
        int[] array = {9, 4, 13, 8, 8, 15};
        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void quickSort(int[] array, int low, int high) {
        int i = 0, j = 0, temp, pivot = 0;

        if (low < high) {
            i = low;
            j = high;
            pivot = low;


            while (i < j) {
                while (array[i] <= array[pivot] && i < high) {
                    i++;
                }

                while (array[j] > array[pivot] && j > 0) {
                    j--;
                }
                if (i < j) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

            temp = array[pivot];
            array[pivot] = array[j];
            array[j] = temp;

            quickSort(array, low, j - 1);
            quickSort(array, j + 1, high);
        }
    }
}
