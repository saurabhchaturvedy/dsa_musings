package com.dsa.saurabh.level01.SubArrayWithAGivenSum;

public class SubArraySum {


    private static void subArraySum(int[] arr, int sum) {
        int start = 0;
        int s = 0;
        int i = 0;

        for (i = 0; i < arr.length; i++) {
            s = s + arr[i];

            while (s > sum) {
                s = s - arr[start];
                start++;
            }

            if (s == sum) {
                break;
            }

        }
        System.out.println("indexes are : (" + start + "," + i + ")");
    }


    public static void main(String[] args) {

        int[] arr = {7, 8, 3, 5, 8, 1, 3, 4};
        int sum = 24;
        subArraySum(arr, sum);
    }
}
