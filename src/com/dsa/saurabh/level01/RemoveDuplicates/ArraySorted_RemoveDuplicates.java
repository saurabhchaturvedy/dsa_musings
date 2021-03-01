package com.dsa.saurabh.level01.RemoveDuplicates;

public class ArraySorted_RemoveDuplicates {


    private static void removeDuplicates(int array[], int n) {
        int j = 0;
        int[] temp = new int[n];

        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j] = array[i];
                j++;
            }
        }

        temp[j++] = array[n - 1];

        for (int i = 0; i < j; i++) {
            array[i] = temp[i];
        }

        for (int i = 0; i < j; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 7, 9};
        removeDuplicates(array, array.length);
    }
}
