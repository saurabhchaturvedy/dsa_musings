package com.dsa.saurabh.level01.Array_CS;


import java.util.HashSet;
//21
public class Array_ProductMatch {


    private static boolean ifProductExists(int[] arr, int product) {
        HashSet<Integer> s = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (product % arr[i] == 0 && s.contains(product / arr[i])) {
                return true;
            }

            s.add(arr[i]);
        }

        return false;
    }


    public static void main(String[] args) {
        int arr[] = {4, 2, 3, 10, 4, 15, 3, 6};
        System.out.println(ifProductExists(arr, 15));
    }
}
