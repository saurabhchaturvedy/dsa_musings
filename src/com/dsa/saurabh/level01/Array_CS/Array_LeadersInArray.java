package com.dsa.saurabh.level01.Array_CS;
//14
public class Array_LeadersInArray {


    private static void leadersInArray(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > max) {
                max = array[i];
                System.out.print(array[i]+" ");
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = {14, 15, 8, 9, 5, 2};
        leadersInArray(arr);
    }
}
