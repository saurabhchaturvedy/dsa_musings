package com.dsa.saurabh.level04.LinkedList.Till40;

public class LinkedList_Identical {


    ListNode head;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }


    private int size(ListNode node) {
        if (node == null) return 0;
        return 1 + size(node.next);
    }

    private boolean areIdentical(ListNode first, ListNode second) {
        int size1 = size(first);
        int size2 = size(second);

        if (size1 != size2) {
            return false;
        }

        first = head;
        second = head;

        while (first != null && second != null) {
            if (first.data != second.data) {
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return (first == null && second == null);
    }


    public static void main(String[] args) {

    }
}
