package com.dsa.saurabh.level01.Array_CS;
//29
public class Array_SubArrayWithMaxSum {


    private static int subArrayWithSum(int[] array) {
        if (array.length == 0)
            return -1;

        boolean isPositiveExists = false;
        int max_element = Integer.MIN_VALUE;
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                isPositiveExists = true;
            }

            max_element = Math.max(max_element, array[i]);
            sum = sum + array[i];
            if (sum < 0) {
                sum = 0;
                continue;
            }

            max_sum = Math.max(max_sum, sum);
        }

        return isPositiveExists ? max_sum : max_element;
    }


    public static void main(String[] args) {
        int[] array = {-3, 2, -7, 6, -2, 4, -8, 5};
        System.out.println(subArrayWithSum(array));
    }
}
