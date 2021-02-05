package com.dsa.saurabh.level01.LinkedList_CS;

public class LinkedList_MergeSortedLists {

    private ListNode head;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }


    private ListNode mergeSortedLists(ListNode first, ListNode second) {
        ListNode temp = new ListNode(0);
        ListNode finalList = temp;

        while (first != null && second != null) {
            if (first.data < second.data) {
                temp.next = first;
                first = first.next;
            } else {
                temp.next = second;
                second = second.next;
            }

            temp = temp.next;
        }

        temp.next = (first == null) ? second : first;
        return finalList;
    }


    private static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.data != 0)
                System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        LinkedList_MergeSortedLists linkedList_mergeSortedLists = new LinkedList_MergeSortedLists();
        linkedList_mergeSortedLists.head = new ListNode(3);
        ListNode second = new ListNode(6);
        ListNode third = new ListNode(8);

        linkedList_mergeSortedLists.head.next = second;
        second.next = third;

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(5);
        ListNode three = new ListNode(7);
        one.next = two;
        two.next = three;

        ListNode listNode = linkedList_mergeSortedLists.mergeSortedLists(linkedList_mergeSortedLists.head, one);
        display(listNode);
    }
}
