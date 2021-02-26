package com.dsa.saurabh.level01.Array_CS;
//6
public class Array_ContiguousSum {


    private static int largestContiguosSum(int[] array) {
        int currentMax = 0;
        int maxSoFar = 0;
        for (int i = 1; i < array.length; i++) {
            currentMax = Math.max(array[i], currentMax + array[i]);
            maxSoFar = Math.max(currentMax, maxSoFar);

        }

        return maxSoFar;
    }


    public static void main(String[] args) {
        int arr[] = {-3, -4, 4, -1, -2, 1, 5, -3};
        System.out.println(largestContiguosSum(arr));
    }
}
