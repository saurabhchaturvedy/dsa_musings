package com.dsa.saurabh.level01.Array_CS;

public class Array_BinarySearch {


    private static boolean binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) >> 1;
            if (array[mid] == key) return true;
            if (key < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        System.out.println(" is value found ? " + binarySearch(array, 122));
    }
}
