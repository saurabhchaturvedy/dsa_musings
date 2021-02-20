package com.dsa.saurabh.level01.ArrayEquilibriumPoint;

public class EquilibriumPoint_2Pointer {


    public static int findMiddleIndex(int[] array) {
        int low = 0;
        int high = array.length - 1;
        int left_sum = 0;
        int right_sum = 0;

        while (true) {
            if (left_sum < right_sum) {
                left_sum = left_sum + array[low++];
            } else {
                right_sum = right_sum + array[high--];
            }

            if (low > high) {
                if (left_sum == right_sum) {
                    break;
                } else {
                    throw new RuntimeException("No such middle point could be found...");
                }
            }
        }
        return high;
    }


    public static void main(String[] args) {
        int[] array = {1, 7, 5, 2, 8, 3};
        System.out.println("middle index is : " + findMiddleIndex(array));
    }
}
