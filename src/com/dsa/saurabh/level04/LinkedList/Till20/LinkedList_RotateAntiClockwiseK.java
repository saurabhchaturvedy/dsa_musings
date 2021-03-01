package com.dsa.saurabh.level04.LinkedList.Till20;

public class LinkedList_RotateAntiClockwiseK {


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
            return setNewNode(data);
        } else {
            node.next = add(node.next, data);
        }

        return node;
    }

    private ListNode setNewNode(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = null;
        return newNode;
    }

    private void display(ListNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        display(node.next);
    }

    private ListNode rotateClockwiseByK(ListNode node, int k) {
        if (node == null || k < 0) return node;

        k = k % size(node);
        if (k == 0) return node;
        int moveTillDistance = k;

        int count = 1;

        ListNode temp = node;

        while (count < moveTillDistance) {
            temp = temp.next;
            count++;
        }

        ListNode tempNext = temp.next;
        ListNode head = tempNext;
        temp.next = null;


        while (tempNext.next != null) {
            tempNext = tempNext.next;
        }

        tempNext.next = node;
        return head;
    }


    private int size(ListNode node) {
        if (node == null) return 0;
        return 1 + size(node.next);
    }


    public static void main(String[] args) {
        LinkedList_RotateAntiClockwiseK linkedList_rotateClockwise = new LinkedList_RotateAntiClockwiseK();
        linkedList_rotateClockwise.head = linkedList_rotateClockwise.add(linkedList_rotateClockwise.head, 12);
        linkedList_rotateClockwise.head = linkedList_rotateClockwise.add(linkedList_rotateClockwise.head, 99);
        linkedList_rotateClockwise.head = linkedList_rotateClockwise.add(linkedList_rotateClockwise.head, 37);
        linkedList_rotateClockwise.head = linkedList_rotateClockwise.add(linkedList_rotateClockwise.head, 8);
        linkedList_rotateClockwise.head = linkedList_rotateClockwise.add(linkedList_rotateClockwise.head, 18);

        linkedList_rotateClockwise.display(linkedList_rotateClockwise.head);

        linkedList_rotateClockwise.head = linkedList_rotateClockwise.rotateClockwiseByK(linkedList_rotateClockwise.head, 2);
        System.out.println();

        linkedList_rotateClockwise.display(linkedList_rotateClockwise.head);

    }
}
