package com.dsa.saurabh.level01.Recursion;

public class PowerSet {


    private static void subset(String str, int index, String curr) {
        if (index == str.length()) {
            System.out.println(curr);
            return;
        }

        subset(str, index + 1, curr + str.charAt(index));
        subset(str, index + 1, curr);
    }

    public static void main(String[] args) {
        String str = "abc";
        String curr = "";
        int index = 0;
        subset(str, index, curr);

    }
}
