package com.dsa.saurabh.level01.Array_CS;
//8
public class Array_EquilibriumPoint {
    private static int equilibriumPoint(int arr[]) {
        int rightSum = 0;
        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            rightSum = rightSum + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            rightSum = rightSum - arr[i];
            {
                if (leftSum == rightSum) {
                    return i;
                }
                leftSum = leftSum + arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2, 2};
        System.out.println(equilibriumPoint(arr));
    }
}
