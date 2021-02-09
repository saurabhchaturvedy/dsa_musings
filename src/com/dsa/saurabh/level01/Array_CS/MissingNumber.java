package com.dsa.saurabh.level01.Array_CS;

public class MissingNumber {


    private static int missingNumber(int[] arr, int n) {
        int sum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }
        return (sum - actualSum);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 6, 7, 8};
        System.out.println(missingNumber(arr, arr.length + 1));
    }
}
