package com.dsa.saurabh.level01.LongestCommonPrefix;

public class LongestCommonPrefix {


    private static String longestCommonPrefix(String[] array) {
        String longestCommonPrefix = "";
        if (array == null || array.length == 0) {
            return longestCommonPrefix;
        }
        int index = 0;
        for (char c : array[0].toCharArray()) {
            for (int i = 1; i < array.length; i++) {
                if (index >= array[i].length() || c != array[i].charAt(index)) {
                    return longestCommonPrefix;
                }
            }
            longestCommonPrefix += c;
            index++;
        }

        return longestCommonPrefix;
    }


    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(str));
    }
}
