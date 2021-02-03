package com.dsa.saurabh.level01.Recursion;

import java.util.Stack;

public class Recursion_SortStack {


    private static void sortStack(Stack<Integer> stack) {

        while (!stack.isEmpty()) {
            Integer pop = stack.pop();
            sortStack(stack);
            insertSorted(stack, pop);
        }
    }

    private static void insertSorted(Stack<Integer> stack, Integer pop) {

        if (stack.isEmpty() || pop > stack.peek()) {
            stack.push(pop);
            return;
        }

        int temp = stack.pop();
        insertSorted(stack, pop);

        stack.push(temp);
    }


    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(6);
        integerStack.push(5);
        integerStack.push(2);
        integerStack.push(9);

        sortStack(integerStack);

        integerStack.stream().forEach(System.out::println);


    }
}
