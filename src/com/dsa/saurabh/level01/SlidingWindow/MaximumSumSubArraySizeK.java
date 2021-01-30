package com.dsa.saurabh.level01.SlidingWindow;

public class MaximumSumSubArraySizeK {


    private static int maximumSumSubArraySize(int[] arr, int k) {
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        while (j < arr.length) {
            sum = sum + arr[j];

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                max = Math.max(max, sum);
                sum = sum - arr[i];
                i++;
                j++;

            }

        }

        return max;
    }


    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};

        System.out.println(maximumSumSubArraySize(arr, 2));
    }
}
