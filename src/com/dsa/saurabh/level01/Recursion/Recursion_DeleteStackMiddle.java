package com.dsa.saurabh.level01.Recursion;

import java.util.Stack;

public class Recursion_DeleteStackMiddle {


    private static void deleteMiddleElement(Stack<Integer> stack, int n, int curr) {

        if (stack.isEmpty() || curr == n) {
            return;
        }


        Integer item = stack.pop();
        deleteMiddleElement(stack, n, curr + 1);

        if (curr != n / 2)
            stack.push(item);

    }


    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        integerStack.push(9);
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(6);

        deleteMiddleElement(integerStack, integerStack.size(), 0);

        while (!integerStack.isEmpty()) {
            Integer pop = integerStack.pop();
            System.out.println(pop + " ");
        }
    }
}
