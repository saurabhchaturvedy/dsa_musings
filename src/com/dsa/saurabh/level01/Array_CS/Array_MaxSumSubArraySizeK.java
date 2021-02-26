package com.dsa.saurabh.level01.Array_CS;
//17
public class Array_MaxSumSubArraySizeK {


    private static int maximumSumSubArraySizeK(int[] array, int k) {
        if (array == null || array.length == 0 || k <= 0 || k > array.length)
            return 0;

        int sum = 0;
        int i = 0;

        for (i = 0; i < k; i++) {
            sum = sum + array[i];
        }

        int max_sum = sum;
        int start = 0;

        for (int j = k; j < array.length; j++) {
            sum = sum + array[j] - array[start++];
            if (sum > max_sum) {
                max_sum = sum;
            }
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 5, 4, 1};
        System.out.println(maximumSumSubArraySizeK(array,3));
    }
}
