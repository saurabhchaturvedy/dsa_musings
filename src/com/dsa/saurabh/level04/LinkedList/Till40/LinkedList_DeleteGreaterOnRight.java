package com.dsa.saurabh.level04.LinkedList.Till40;

public class LinkedList_DeleteGreaterOnRight {

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

    private ListNode setNewNode(int data) {
        ListNode listNode = new ListNode(data);
        listNode.next = null;
        return listNode;
    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }

    private ListNode deleteGreaterElementsOnRight(ListNode node) {
        ListNode reverse = reverse(node);
        int max = reverse.data;

        while (reverse.next != null) {
            if (reverse.next.data > max) {
                max = reverse.next.data;
                reverse = reverse.next;
            }

            reverse = reverse.next.next;
        }

        reverse = reverse(reverse);
        return reverse;
    }

    public static void main(String[] args) {

    }
}
