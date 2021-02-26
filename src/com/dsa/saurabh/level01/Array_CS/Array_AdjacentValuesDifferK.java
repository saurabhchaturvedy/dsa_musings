package com.dsa.saurabh.level01.Array_CS;
//2
public class Array_AdjacentValuesDifferK {


    private static int indexValuesDifferByK(int[] array, int k, int value) {
        if (array.length == 0) return -1;

        int start = 0;

        while (start < array.length) {
            if (array[start] == value) return start;
            int diff = Math.abs(array[start] - value) / k;
            start = start + diff;

        }
        return -1;

    }

    public static void main(String[] args) {
        int arr1[] = {70, 60, 70, 80, 90, 110, 130};
        int arr2[] = {2, 3, 2, 4, 5, 6, 7};

        System.out.println(indexValuesDifferByK(arr1, 20, 110));
        System.out.println(indexValuesDifferByK(arr2, 1, 5));
    }
}
