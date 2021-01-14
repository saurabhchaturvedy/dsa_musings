package com.dsa.saurabh.level01.ConvertStrToIntWithoutParseInt;

public class ConvertStrToInt {


    private static int convertStringNumberToInt(String str) {
        char[] chars = str.toCharArray();
        int zeroAscii = (int) '0';
        int sum = 0;
        for (char c : chars) {
            int nextAscii = (int) c;
            sum = sum * 10 + (nextAscii - zeroAscii);
        }
        return sum;
    }


    public static void main(String[] args) {

        System.out.println(convertStringNumberToInt("123"));
    }
}
