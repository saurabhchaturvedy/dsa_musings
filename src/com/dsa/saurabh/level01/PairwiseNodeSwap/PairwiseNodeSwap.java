package com.dsa.saurabh.level01.PairwiseNodeSwap;

public class PairwiseNodeSwap {


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

    private void display(ListNode node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        display(node.next);
    }

    private ListNode pairWiseSwap(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        ListNode current = node;
        ListNode previous = null;

        while (current != null && current.next != null) {
            ListNode temp = current.next;
            current.next = temp.next;
            temp.next = current;

            if (previous == null) {
                node = temp;
            } else {
                previous.next = temp;
            }

            previous = current;
            current = current.next;
        }

        return node;
    }


    public static void main(String[] args) {
        PairwiseNodeSwap pairwiseNodeSwap = new PairwiseNodeSwap();
        pairwiseNodeSwap.head = pairwiseNodeSwap.add(pairwiseNodeSwap.head, 10);
        pairwiseNodeSwap.head = pairwiseNodeSwap.add(pairwiseNodeSwap.head, 20);
        pairwiseNodeSwap.head = pairwiseNodeSwap.add(pairwiseNodeSwap.head, 30);
        pairwiseNodeSwap.head = pairwiseNodeSwap.add(pairwiseNodeSwap.head, 40);

        pairwiseNodeSwap.display(pairwiseNodeSwap.head);

        System.out.println();

        ListNode listNode = pairwiseNodeSwap.pairWiseSwap(pairwiseNodeSwap.head);

        System.out.println();

        pairwiseNodeSwap.display(listNode);
    }
}
