package com.dsa.saurabh.level01.QueueUsingStack;

import java.util.Stack;

public class QueueUsingStack {


    private Stack<Integer> enqueueStack = new Stack<>();

    private Stack<Integer> dequeueStack = new Stack<>();

    private void enqueue(int item) {
        enqueueStack.push(item);
    }

    private int dequeue() {
        if (enqueueStack.isEmpty() && dequeueStack.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }

        return dequeueStack.pop();
    }

    public static void main(String[] args) {
        QueueUsingStack queueUsingStack = new QueueUsingStack();
        queueUsingStack.enqueue(10);
        queueUsingStack.enqueue(20);
        queueUsingStack.enqueue(30);
        queueUsingStack.enqueue(40);

        System.out.println(queueUsingStack.dequeue());
    }
}
