package com.dsa.saurabh.level04.LinkedList.Till40;

public class LinkedList_SwapNodesWithoutDataSwap {

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

    private ListNode swapNodesWithoutDataSwap(ListNode node, int dataA, int dataB) {
        if (node == null || node.next == null) return node;

        ListNode temp1 = null, temp2 = null, prev1 = null, prev2 = null;
        ListNode head = null;

        head = node;

        while (node != null) {
            if (node.data == dataA) {
                temp1 = node;
                break;
            }

            prev1 = node;
            node = node.next;
        }

        node = head;

        while (node != null) {
            if (node.data == dataB) {
                temp2 = node;
                break;
            }

            prev2 = node;
            node = node.next;
        }

        if (temp1 == null || temp2 == null)
            return head;

        if (prev1 != null) {
            prev1.next = temp2;
        } else {
            head = temp2;
        }

        if (prev2 != null) {
            prev2.next = temp1;
        } else {
            head = temp1;
        }

        ListNode temp = temp1.next;
        temp1.next = temp2.next;
        temp2.next = temp;

        return head;
    }

    public static void main(String[] args) {

    }
}
