package com.dsa.saurabh.level01.RemoveDuplicates;

public class ArraySorted_RemoveDuplicatesConstantSpace {


    private static void removeDuplicates(int[] array, int n) {
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[j] = array[i];
                j++;
            }
        }

        array[j++] = array[n - 1];

        for (int i = 0; i < j; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 7, 9};
        removeDuplicates(array, array.length);
    }
}
