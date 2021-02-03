package com.dsa.saurabh.level01.Recursion;

public class KthSymbolGrammar {


    private static int KthSymbol(int N, int K) {
        if (N == 1) return 0;

        int r1 = (K + 1) / 2;
        int r2 = (K + 1) % 2;

        int prev = KthSymbol(N - 1, r1);

        return prev == 0 ? (r2 == 0 ? 0 : 1) : (r2 == 0 ? 1 : 0);
    }


    public static void main(String[] args) {
        System.out.println(KthSymbol(2,2));
    }
}
