package com.dsa.saurabh.level01.Array_CS;

import java.util.HashMap;
import java.util.Map;
//26
public class Array_SmallestSubArrayGivenSum {


    private static int smallestSubArrayGivenSum(int[] array, int sum) {
        if (array == null || array.length == 0)
            return -1;

        int low = 0;
        int high = 0;
        int window_sum = 0;
        int smallest_subarray_length = Integer.MAX_VALUE;

        while (high < array.length) {
            window_sum = window_sum + array[high];


            if (window_sum == sum) {
                System.out.println("start index " + low + "end index " + high);
                smallest_subarray_length = Math.min(smallest_subarray_length, (high - low) + 1);
            }

            while (window_sum > sum && low <= array.length) {
                window_sum = window_sum - array[low++];
                System.out.println("start index " + low + "end index " + high);
                smallest_subarray_length = Math.min(smallest_subarray_length, (high - low) + 1);
            }

            high++;
        }

        return smallest_subarray_length != Integer.MAX_VALUE ? smallest_subarray_length : -1;
    }

    private static int smallestSubArrayGivenSumNegative(int[] array, int sum) {
        if (array == null || array.length == 0)
            return -1;

        int window_sum = 0;
        Map<Integer, Integer> currentSumIndexMap = new HashMap<>();
        int high = 0;
        int total_sum_till_now = 0;
        int smallest_subarray_length = Integer.MAX_VALUE;

        while (high < array.length) {
            total_sum_till_now = total_sum_till_now + array[high];

            if (total_sum_till_now == sum) {
                System.out.println("start index " + 0 + "end index " + high);
                smallest_subarray_length = Math.min(smallest_subarray_length, high + 1);
            }

            window_sum = total_sum_till_now - sum;
            if (currentSumIndexMap.containsKey(window_sum)) {
                Integer low = currentSumIndexMap.get(window_sum);
                System.out.println("start index " + (low + 1) + "end index " + high);
                smallest_subarray_length = Math.min(smallest_subarray_length, (high - low));
            }
            currentSumIndexMap.put(total_sum_till_now, high++);
        }

        return smallest_subarray_length != Integer.MAX_VALUE ? smallest_subarray_length : -1;
    }


    public static void main(String[] args) {
        int[] array = {3, 2, 5, 5, 3, 2, 10};
        int sum = 10;
        System.out.println(smallestSubArrayGivenSumNegative(array, 10));
    }
}
