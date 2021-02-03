package com.dsa.saurabh.level01.Recursion;

public class Print1toN {


    private static void print1toN(int n) {
        if (n == 0) return;
        print1toN(n - 1);
        System.out.print(n);
    }

    private static void printNto1(int n) {
        if (n == 0) return;
        System.out.print(n);
        printNto1(n - 1);

    }


    public static void main(String[] args) {
        int x = 7;
        print1toN(x);
        System.out.println();
        printNto1(x);
    }
}
