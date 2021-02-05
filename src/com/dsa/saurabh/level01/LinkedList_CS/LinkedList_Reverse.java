package com.dsa.saurabh.level01.LinkedList_CS;

public class LinkedList_Reverse {

    private ListNode head;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;  // either no list or only one element
        }

        ListNode temp = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }

    private static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " - > ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList_Reverse linkedList_reverse = new LinkedList_Reverse();
        linkedList_reverse.head = new ListNode(10);
        ListNode second = new ListNode(20);
        linkedList_reverse.head.next = second;
        display(linkedList_reverse.head);
        ListNode reverse = linkedList_reverse.reverse(linkedList_reverse.head);
        display(reverse);
    }
}
