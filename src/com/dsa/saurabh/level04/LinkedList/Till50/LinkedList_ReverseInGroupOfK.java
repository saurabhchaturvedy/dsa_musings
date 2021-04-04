package com.dsa.saurabh.level04.LinkedList.Till50;

public class LinkedList_ReverseInGroupOfK {

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


    private ListNode reverseInGroupOfK(ListNode node, int k) {
        if (node == null) {
            return null;
        }

        ListNode current = node;
        ListNode previous = null;
        ListNode next = null;

        int i = 0;

        while (current != null && i < k) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            i++;
        }

        if (next != null) {
            node.next = reverseInGroupOfK(next, k);
        }

        return previous;
    }

    private void display(ListNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        display(node.next);
    }

    public static void main(String[] args) {
        LinkedList_ReverseInGroupOfK linkedList_reverseInGroupOfK = new LinkedList_ReverseInGroupOfK();
        linkedList_reverseInGroupOfK.head = linkedList_reverseInGroupOfK.add(linkedList_reverseInGroupOfK.head, 10);
        linkedList_reverseInGroupOfK.head = linkedList_reverseInGroupOfK.add(linkedList_reverseInGroupOfK.head, 20);
        linkedList_reverseInGroupOfK.head = linkedList_reverseInGroupOfK.add(linkedList_reverseInGroupOfK.head, 30);
        linkedList_reverseInGroupOfK.head = linkedList_reverseInGroupOfK.add(linkedList_reverseInGroupOfK.head, 40);
        linkedList_reverseInGroupOfK.head = linkedList_reverseInGroupOfK.add(linkedList_reverseInGroupOfK.head, 50);
        linkedList_reverseInGroupOfK.head = linkedList_reverseInGroupOfK.add(linkedList_reverseInGroupOfK.head, 60);

        System.out.println("displaying the list :");

        linkedList_reverseInGroupOfK.display(linkedList_reverseInGroupOfK.head);

        System.out.println();

        ListNode listNode = linkedList_reverseInGroupOfK.reverseInGroupOfK(linkedList_reverseInGroupOfK.head, 2);

        System.out.println();

        System.out.println("swapped list in groups of 2");

        linkedList_reverseInGroupOfK.display(listNode);


    }
}
