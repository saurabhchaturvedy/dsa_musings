package com.dsa.saurabh.level01.MaxInAStackProblem;

import java.util.Stack;

public class MaxInAStack {


    private Stack<Integer> mainStack = new Stack<>();

    private Stack<Integer> maxStack = new Stack<>();


    private void push(int item) {
        mainStack.push(item);

        if (mainStack.size() == 1) {
            maxStack.push(item);
            return;
        }

        if (item > maxStack.peek()) {
            maxStack.push(item);
        } else {
            maxStack.push(maxStack.peek());
        }
    }

    private int pop() {
        maxStack.pop();
        return mainStack.pop();
    }

    private int max() {
        return maxStack.peek();
    }


    public static void main(String[] args) {
        MaxInAStack maxInAStack = new MaxInAStack();
        maxInAStack.push(23);
        maxInAStack.push(33);
        maxInAStack.push(8);
        maxInAStack.push(15);
        maxInAStack.push(75);
        maxInAStack.push(43);

        System.out.println(maxInAStack.max());
    }
}
