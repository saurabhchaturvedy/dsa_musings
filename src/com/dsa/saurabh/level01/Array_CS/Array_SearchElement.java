package com.dsa.saurabh.level01.Array_CS;

public class Array_SearchElement {


    private static int searchIndex(int[] array, int item) {
        if (array.length == 0) return -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) return i;
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] array = {4, 11, 8, 13, 27, 16};
        System.out.println(searchIndex(array, 8));
    }
}
