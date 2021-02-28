package com.dsa.saurabh.level04.LinkedList.Till10;

public class LinkedList_Print {

    ListNode head;

    private class ListNode {
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

    public static void main(String[] args) {
        LinkedList_Print linkedList_print = new LinkedList_Print();
        linkedList_print.head = linkedList_print.add(linkedList_print.head, 20);
        linkedList_print.head = linkedList_print.add(linkedList_print.head, 40);
        linkedList_print.head = linkedList_print.add(linkedList_print.head, 60);
        linkedList_print.head = linkedList_print.add(linkedList_print.head, 80);
        linkedList_print.print(linkedList_print.head);
    }
}
