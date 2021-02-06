package com.dsa.saurabh.level01.Stack_CS;

public class Stack_LinkedList {

    ListNode top;
    int length = 0;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Stack_LinkedList() {
        this.top = null;
        this.length = 0;

    }

    private boolean isEmpty() {
        return length == 0;
    }

    private void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    private int pop() {
        if (isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    private void display() {
        ListNode temp = top;
        while (top != null) {
            System.out.print(top.data + " ");
            top = top.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack_LinkedList stack_linkedList = new Stack_LinkedList();
        stack_linkedList.push(23);
        stack_linkedList.push(10);
        stack_linkedList.push(5);
        stack_linkedList.push(19);

        System.out.println(stack_linkedList.pop());
        stack_linkedList.display();
    }
}
