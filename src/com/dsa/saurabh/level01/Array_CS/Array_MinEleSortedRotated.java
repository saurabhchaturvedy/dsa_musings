package com.dsa.saurabh.level01.Array_CS;
//19
public class Array_MinEleSortedRotated {


    private static int minSortedRotated(int[] array) {

        int low = 0;
        int high = array.length - 1;

        while (low < high) {
            int mid = (low + high) >> 1;
            if (array[mid] > array[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return array[low];

    }


    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        System.out.println(minSortedRotated(arr));
    }
}
