package com.dsa.saurabh.level04.LinkedList.Till40;

import java.util.Stack;

public class LinkedList_IsPalindrome {


    ListNode head;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }


    private ListNode add(ListNode node, int data) {
        if (node == null) {
            return setNewNode(data);
        } else {
            node.next = add(node.next, data);
        }
        return node;
    }

    private boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        Stack<ListNode> stack = new Stack<>();
        stack.push(slow);

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            stack.push(slow);
        }

//        if (fast.next != null) {
//            stack.pop();
//        }

        ListNode secondHalf = slow.next;

        while (secondHalf != null) {
            if (stack.pop().data != secondHalf.data) {
                return false;
            }

            secondHalf = secondHalf.next;
        }

        return true;
    }

    private ListNode setNewNode(int data) {
        ListNode listNode = new ListNode(data);
        listNode.next = null;
        return listNode;
    }

    public static void main(String[] args) {
        LinkedList_IsPalindrome linkedList_isPalindrome = new LinkedList_IsPalindrome();
        linkedList_isPalindrome.head = linkedList_isPalindrome.add(linkedList_isPalindrome.head, 10);
        linkedList_isPalindrome.head = linkedList_isPalindrome.add(linkedList_isPalindrome.head, 10);
        linkedList_isPalindrome.head = linkedList_isPalindrome.add(linkedList_isPalindrome.head, 10);

        boolean palindrome = linkedList_isPalindrome.isPalindrome(linkedList_isPalindrome.head);
        System.out.println("Is linked list palindrome ? " + palindrome);
    }
}
