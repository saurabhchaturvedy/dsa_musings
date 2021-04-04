package com.dsa.saurabh.level01.Recursion;

public class KPersonGame {


    private String kPersonGame(int finderIndex, int[] A, char[] S, String currentString) {

        int k = A[finderIndex];
        if (S.length != A.length || (currentString.length() == A.length) || k == 0) return currentString;
        char myFoundString = S[k];
        currentString = currentString + myFoundString;
        return kPersonGame(k, A, S, currentString);
    }

    private String getString(int k1, int[] A, char[] S, String currentString) {
        int k = A[k1];
        if (S.length != A.length || (currentString.length() == A.length) || k == 0) return currentString;
        char myFoundString = S[k];
        currentString = currentString + myFoundString;
        return getString(k, A, S, currentString);
    }


    private String kPersonGameIterative(String str ,int[] A) {
        int finderIndex=0;
        char[] chars = str.toCharArray();
        return getString(finderIndex, A, chars, Character.toString(str.charAt(0)));

    }



    public static void main(String[] args) {

        String str = "cdeo";
        char[] S = str.toCharArray();
        int[] A = {3,2,0,1};
        char[] x = new char[str.charAt(0)];
        KPersonGame kPersonGame = new KPersonGame();
        System.out.println("resultant string : " + kPersonGame.kPersonGameIterative(str,A));

    }
}
