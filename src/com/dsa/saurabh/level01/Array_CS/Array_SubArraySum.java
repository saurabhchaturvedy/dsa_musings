package com.dsa.saurabh.level01.Array_CS;

import java.util.HashMap;
import java.util.Map;
//28
public class Array_SubArraySum {


    private static void subArraySum(int[] array, int targetSum) {
        if (array == null || array.length == 0)
            return;
        int low = 0;
        int high = 0;
        int window_sum = 0;

        while (high < array.length) {
            window_sum = window_sum + array[high];

            if (window_sum == targetSum) {
                System.out.println("start index : " + low + " end index " + high);
                return;
            }

            while (window_sum > targetSum && low <= high) {
                window_sum = window_sum - array[low++];
                if (window_sum == targetSum) {
                    System.out.println("start index : " + low + " end index " + high);
                    return;
                }
            }
            high++;
        }
        System.out.println("No subarray found with sum " + targetSum);
    }

    private static void subArraySumNegatives(int[] array, int targetSum) {
        if (array == null || array.length == 0)
            return;

        int high = 0;
        int window_sum = 0;
        int total_sum_till_now = 0;
        Map<Integer, Integer> targetSumIndexMap = new HashMap<>();

        while (high < array.length) {
            total_sum_till_now = total_sum_till_now + array[high];

            if (total_sum_till_now == targetSum) {
                System.out.println("start index " + 0 + "end index :" + high);
                return;
            }

            window_sum = total_sum_till_now - targetSum;

            if (targetSumIndexMap.containsKey(window_sum)) {
                Integer start_index = targetSumIndexMap.get(window_sum);
                System.out.println("start index " + (start_index + 1) + " end index: " + high);
                return;
            }
            targetSumIndexMap.put(window_sum, high++);
        }

    }

    public static void main(String[] args) {
        int[] array = {4, 2, -5, 3, 1, 8};
        int sum = -2;
        subArraySumNegatives(array, sum);
    }
}
