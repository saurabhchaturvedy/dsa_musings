package com.dsa.saurabh.level04.LinkedList.Till10;

public class LinkedList_DeleteFront {


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

    private ListNode deleteFront(ListNode node) {
        if (node == null) return null;

        return node.next;
    }


    public static void main(String[] args) {
        LinkedList_DeleteFront linkedList_deleteFront = new LinkedList_DeleteFront();
        linkedList_deleteFront.head = linkedList_deleteFront.add(linkedList_deleteFront.head, 20);
        linkedList_deleteFront.head = linkedList_deleteFront.add(linkedList_deleteFront.head, 40);
        linkedList_deleteFront.head = linkedList_deleteFront.add(linkedList_deleteFront.head, 60);
        linkedList_deleteFront.head = linkedList_deleteFront.add(linkedList_deleteFront.head, 80);

        linkedList_deleteFront.display(linkedList_deleteFront.head);

        linkedList_deleteFront.head = linkedList_deleteFront.deleteFront(linkedList_deleteFront.head);

        System.out.println();

        linkedList_deleteFront.display(linkedList_deleteFront.head);
    }
}
