package com.dsa.saurabh.level01.Stack_CS;

import java.util.Stack;

public class Stack_ReverseString {


    private String reverse(String str) {
        Stack<Character> characterStack = new Stack<>();
        String reversed = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            characterStack.push(c);
        }

        while (!characterStack.isEmpty()) {
            reversed = reversed + characterStack.pop();
        }

        return reversed;
    }


    public static void main(String[] args) {
        String str = "mexico";
        Stack_ReverseString stack_reverseString = new Stack_ReverseString();
        System.out.println(stack_reverseString.reverse(str));
    }
}
