package com.dsa.saurabh.level01.DynamicProgramming_AV;

public class _01KnapsackRecursive {


    private static int knapsackRecursive(int[] weight, int[] values, int W, int n) {
        if (n == 0 || W == 0)
            return 0;

        if (weight[n - 1] <= W)
            return Math.max(values[n - 1] + knapsackRecursive(weight, values, W - weight[n - 1], n - 1), knapsackRecursive(weight, values, W, n - 1));
        return knapsackRecursive(weight, values, W, n - 1);
    }


    public static void main(String[] args) {

        int[] weight = {4, 2, 3};
        int[] values = {10, 4, 7};
        int n = 3;
        int W = 5;
        System.out.println(knapsackRecursive(weight, values, W, n));
    }
}
