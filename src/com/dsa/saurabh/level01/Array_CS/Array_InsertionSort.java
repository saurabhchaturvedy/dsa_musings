package com.dsa.saurabh.level01.Array_CS;

public class Array_InsertionSort {


    private static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
    }


    public static void main(String[] args) {
        int[] array = {9, 4, 13, 7, 8, 15};
        insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
