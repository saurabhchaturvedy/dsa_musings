package com.dsa.saurabh.level01.MaxContiguousSubArraySum;

public class KadaneAlgorithm {


    private static int maxContiguousSubArray(int[] array) {
        int lMax = array[0];
        int gMax = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > (array[i] + lMax)) {
                lMax = array[i];
            } else {
                lMax = lMax + array[i];

            }
            gMax = Math.max(lMax, gMax);
        }

        return gMax;
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, -2, 5};
        System.out.println(maxContiguousSubArray(array));
    }
}
