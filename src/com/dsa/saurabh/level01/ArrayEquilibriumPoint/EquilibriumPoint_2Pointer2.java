package com.dsa.saurabh.level01.ArrayEquilibriumPoint;

public class EquilibriumPoint_2Pointer2 {


    private static int findMiddleIndex(int[] array) {
        int low = 0;
        int high = array.length - 1;
        int left_sum = 0;
        int right_sum = 0;

        while (low <= high) {
            if (left_sum > right_sum)
                right_sum = right_sum + array[high--];
            else
                left_sum = left_sum + array[low++];
        }

        if (left_sum == right_sum)
            return high;
        else
            return -1;
    }


    public static void main(String[] args) {
        int[] array = {2, -4, 4, -6, 6, 1, 1};
        System.out.println("Middle index is : " + findMiddleIndex(array));
    }
}
