package com.dsa.saurabh.level04.LinkedList.Till20;

public class LinkedList_ReverseRecursive {

    private ListNode head;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    private ListNode add(ListNode node, int data) {
        if (node == null) {
            return setFirstNode(data);
        } else {
            node.next = add(node.next, data);
        }
        return node;
    }

    private ListNode setFirstNode(int data) {
        ListNode node = new ListNode(data);
        node.next = null;
        return node;
    }

    private void print(ListNode head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        print(head.next);
    }

    private ListNode reverse(ListNode node) {
        if (node == null || node.next == null)
            return node;

        ListNode temp = reverse(node.next);
        node.next.next = node;
        node.next = null;
        return temp;
    }

    public static void main(String[] args) {
        LinkedList_ReverseRecursive linkedList_reverseRecursive = new LinkedList_ReverseRecursive();
        linkedList_reverseRecursive.head = linkedList_reverseRecursive.add(linkedList_reverseRecursive.head, 10);
        linkedList_reverseRecursive.head = linkedList_reverseRecursive.add(linkedList_reverseRecursive.head, 20);
        linkedList_reverseRecursive.head = linkedList_reverseRecursive.add(linkedList_reverseRecursive.head, 30);
        linkedList_reverseRecursive.head = linkedList_reverseRecursive.add(linkedList_reverseRecursive.head, 40);

        linkedList_reverseRecursive.print(linkedList_reverseRecursive.head);

        System.out.println();

        linkedList_reverseRecursive.head = linkedList_reverseRecursive.reverse(linkedList_reverseRecursive.head);

        linkedList_reverseRecursive.print(linkedList_reverseRecursive.head);


    }
}
