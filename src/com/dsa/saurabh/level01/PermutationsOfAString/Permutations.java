package com.dsa.saurabh.level01.PermutationsOfAString;

public class Permutations {


    private static void stringPermutation(char array[], int currentIndex) {
        if (currentIndex == array.length - 1)
            System.out.println(String.valueOf(array));

        for (int i = currentIndex; i < array.length; i++) {

            swap(array, i, currentIndex);
            stringPermutation(array, currentIndex + 1);
            swap(array, i, currentIndex);

        }
    }

    private static void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }


    public static void main(String[] args) {

        String str = "ABC";
        stringPermutation(str.toCharArray(), 0);

    }
}
