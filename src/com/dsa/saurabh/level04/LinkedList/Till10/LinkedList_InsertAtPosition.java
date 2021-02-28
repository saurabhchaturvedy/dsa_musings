package com.dsa.saurabh.level04.LinkedList.Till10;

public class LinkedList_InsertAtPosition {

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
        ListNode node = new ListNode(data);
        node.next = null;
        return node;
    }

    private void display(ListNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        display(node.next);
    }

    public ListNode insertAtPosition(int item, int position, ListNode node) {
        if (position < 0) {
            System.out.println("Position can't be less than 1");
        }

        if (node == null && position > 1) {
            System.out.println("Position is greater than element exists");
            return node;
        }

        if (node == null && position == 1) {
            return setNewNode(item);
        }

        if (position == 1) {
            ListNode newNode = setNewNode(item);
            newNode.next = node;
            return newNode;
        }

        node.next = insertAtPosition(item, position - 1, node.next);
        return node;
    }

    public static void main(String[] args) {
        LinkedList_InsertAtPosition linkedList_insertAtPosition = new LinkedList_InsertAtPosition();
        linkedList_insertAtPosition.head = linkedList_insertAtPosition.add(linkedList_insertAtPosition.head, 30);
        linkedList_insertAtPosition.head = linkedList_insertAtPosition.add(linkedList_insertAtPosition.head, 40);
        linkedList_insertAtPosition.head = linkedList_insertAtPosition.add(linkedList_insertAtPosition.head, 50);
        linkedList_insertAtPosition.head = linkedList_insertAtPosition.add(linkedList_insertAtPosition.head, 60);


        linkedList_insertAtPosition.display(linkedList_insertAtPosition.head);
        System.out.println();

        linkedList_insertAtPosition.head = linkedList_insertAtPosition.insertAtPosition(450, 2, linkedList_insertAtPosition.head);

        linkedList_insertAtPosition.display(linkedList_insertAtPosition.head);

    }
}
