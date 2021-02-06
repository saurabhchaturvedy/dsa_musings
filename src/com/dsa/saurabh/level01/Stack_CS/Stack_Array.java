package com.dsa.saurabh.level01.Stack_CS;

public class Stack_Array {

    int top = 0;
    int MAX = 5;
    int[] stack = new int[MAX];


    private void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stack[top++] = item;
    }

    private int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return stack[--top];
    }

    private boolean isEmpty() {
        return top == 0;
    }

    private boolean isFull() {
        return top == MAX;
    }

    private int size() {
        return top;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Stack_Array stack_array = new Stack_Array();
        stack_array.push(10);
        stack_array.push(20);
        stack_array.push(30);

        System.out.println(stack_array.size());
        System.out.println(stack_array.pop());
    }
}
