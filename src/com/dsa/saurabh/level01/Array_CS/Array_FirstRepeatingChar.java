package com.dsa.saurabh.level01.Array_CS;

import java.util.HashSet;
import java.util.Set;
//9
public class Array_FirstRepeatingChar {

    public int firstRepeatingValueInArray(int[] arr) {
        Set<Integer> s = new HashSet<>();

        int firstRepeating = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (s.contains(arr[i])) {
                firstRepeating = arr[i];
            } else {
                s.add(arr[i]);
            }
        }

        return firstRepeating;
    }


    public static void main(String[] args) {

        Array_FirstRepeatingChar a = new Array_FirstRepeatingChar();
        int arr[] = {2, 3, 4, 4, 3, 5, 7};

        System.out.println(a.firstRepeatingValueInArray(arr));

    }
}
