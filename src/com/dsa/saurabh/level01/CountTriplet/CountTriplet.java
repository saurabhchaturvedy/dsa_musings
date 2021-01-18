package com.dsa.saurabh.level01.CountTriplet;

public class CountTriplet {


    private static int countTriplet(int[] array) {
        int n = array.length;
        int count = 0;
        int[] indexArray = new int[(int) Math.pow(10, n)];

        for (int i = 0; i < n; i++) {
            indexArray[array[i]] = 1;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (indexArray[array[i] + array[j]] == 1)
                {
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 6};
        System.out.println("the triplet count is : " + countTriplet(array));

    }
}
