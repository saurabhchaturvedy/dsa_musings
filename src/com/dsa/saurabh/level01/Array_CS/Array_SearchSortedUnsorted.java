package com.dsa.saurabh.level01.Array_CS;

class Array_SearchSortedUnsorted {

    /*
     * It'll search value in Unsorted array
     */
    public int searchValueInUnsortedArray(int[] arr, int val) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }

        return -1;
    }

    /*
     * It'll search value in sorted array
     */
    public int binarySearchSortedArray(int[] arr, int start, int end, int val) {

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == val) {
                return mid;
            } else if (val > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

}
