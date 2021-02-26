package com.dsa.saurabh.level01.Array_CS;
//33
public class ArrayApp {

    public static void main(String[] args) {

        Array_SearchSortedUnsorted a = new Array_SearchSortedUnsorted();
        int arr[] = {14, 15, 8, 9, 5, 2};

        System.out.println("Found value at Index: " + a.searchValueInUnsortedArray(arr, 9));
        System.out.println("Found value at Index: " + a.searchValueInUnsortedArray(arr, 100));

        int[] arr1 = {2, 7, 9, 15, 50};
        System.out.println("Found value at Index: " + a.binarySearchSortedArray(arr1, 0, arr1.length - 1, 7));
        System.out.println("Found value at Index: " + a.binarySearchSortedArray(arr1, 0, arr1.length - 1, 50));
        System.out.println("Found value at Index: " + a.binarySearchSortedArray(arr1, 0, arr1.length - 1, 100));

    }
}