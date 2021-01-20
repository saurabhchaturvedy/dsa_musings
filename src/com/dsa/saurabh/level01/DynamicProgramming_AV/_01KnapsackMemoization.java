package com.dsa.saurabh.level01.DynamicProgramming_AV;

import java.util.Arrays;
import java.util.stream.Stream;

public class _01KnapsackMemoization {

    static int n = 3;
    static int W = 5;
    private static int[][] t = new int[n + 1][W + 1];

    _01KnapsackMemoization() {
        Arrays.stream(t).forEach(a -> Arrays.fill(a, -1));  // populates each position in the 2-D array with -1
    }


    private static int knapsackMemoization(int[] weight, int[] values, int W, int n) {
        if (W == 0 || n == 0)
            return 0;
        if (t[n][W] != -1)
            return t[n][W];

        if (weight[n - 1] <= W)
            return t[n][W] = Math.max(values[n - 1] + knapsackMemoization(weight, values, W - weight[n - 1], n - 1), knapsackMemoization(weight, values, W, n - 1));
        return t[n][W] = knapsackMemoization(weight, values, W, n - 1);
    }

    public static void main(String[] args) {
        _01KnapsackMemoization knapsackMemoization = new _01KnapsackMemoization();
        int[] weight = {4, 2, 3};
        int[] values = {10, 4, 7};
        System.out.println(knapsackMemoization(weight,values,5,3));

        //Stream.of(t).map(Arrays::toString).forEach(System.out::println); loop through a 2-D array

    }
}
