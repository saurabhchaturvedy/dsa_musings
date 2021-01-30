package com.dsa.saurabh.level01.LargestSubstringWithoutRepeatingChars;

import java.util.HashSet;

public class LargestSubstring {


    private static String largestSubstringWithoutRepeatingChars(String word) {
        HashSet<Character> characters = new HashSet<>();

        String longestTillNow = "";
        String longestOverAll = "";
        int count = 0;
        for (int i = 0; i < word.length(); ) {
            char c = word.charAt(i);
            if (characters.contains(c)) {
                if (longestTillNow.length() > longestOverAll.length()) {
                    longestOverAll = longestTillNow;
                    i = ++count;
                    longestTillNow = "";
                    characters.clear();
                    continue;
                }
            }
            i++;
            if (longestTillNow.indexOf(c) < 0) {
                longestTillNow += c;
            }
            characters.add(c);

        }

        if (longestTillNow.length() > longestOverAll.length()) {
            longestOverAll = longestTillNow;
        }
        return longestOverAll;
    }


    public static void main(String[] args) {
        String str = "ABCDKMLARTES";
        System.out.println(largestSubstringWithoutRepeatingChars(str));
    }
}
