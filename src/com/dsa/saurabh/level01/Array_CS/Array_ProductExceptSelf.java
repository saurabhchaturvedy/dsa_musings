package com.dsa.saurabh.level01.Array_CS;

public class Array_ProductExceptSelf {


    private static int[] productExceptSelf(int[] array) {
        int[] output_array = new int[array.length];

        output_array[0] = 1;

        for (int i = 1; i < array.length; i++) {
            output_array[i] = array[i - 1] * output_array[i - 1];
        }

        int R = 1;

        for (int i = array.length - 1; i >= 0; i--) {
            output_array[i] = output_array[i] * R;
            R = R * array[i];
        }

        return output_array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] ints = productExceptSelf(array);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}
