package com.dsa.saurabh.level01.HappyNumber;

import java.util.HashSet;

public class HappyNumber {


    private static boolean isHappy(int n) {
        HashSet<Integer> sumSet = new HashSet<>();

        while (n != 1) {
            int current = n;
            int sum = 0;

            while (current != 0) {
                sum = sum + (current % 10) * (current % 10);
                current = current / 10;
            }

            if (sumSet.contains(sum)) return false;

            sumSet.add(sum);
            n = sum;
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println(isHappy(20));
    }
}
