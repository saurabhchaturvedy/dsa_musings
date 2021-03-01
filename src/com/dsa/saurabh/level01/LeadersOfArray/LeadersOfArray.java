package com.dsa.saurabh.level01.LeadersOfArray;

public class LeadersOfArray {


    private static void leadersOfArray(int[] array, int n) {
        int leader = array[n - 1];
        System.out.println(leader + " is the leader of array");

        for (int i = n - 2; i >= 0; i--) {
            if (array[i] > leader) {
                leader = array[i];
                System.out.println(leader + " is the leader of array");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {7, 6, 4, 5, 0, 1};
        leadersOfArray(array, array.length);
    }
}
