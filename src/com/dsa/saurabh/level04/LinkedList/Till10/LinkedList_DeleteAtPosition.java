package com.dsa.saurabh.level04.LinkedList.Till10;

public class LinkedList_DeleteAtPosition {


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


    private ListNode deleteLast(ListNode node) {
        if (node == null || node.next == null) return node = null;

        ListNode temp = node;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return node;
    }

    private ListNode deleteAtPosition(int position, ListNode node) {
        if (position < 1) return node;

        if (node == null && position > 1) {
            return node;
        }

        if (position == 1) {
            return node.next;
        }

        node.next = deleteAtPosition(position - 1, node.next);
        return node;
    }

    public static void main(String[] args) {
        LinkedList_DeleteAtPosition linkedList_deleteAtPosition = new LinkedList_DeleteAtPosition();
        linkedList_deleteAtPosition.head = linkedList_deleteAtPosition.add(linkedList_deleteAtPosition.head, 20);
        linkedList_deleteAtPosition.head = linkedList_deleteAtPosition.add(linkedList_deleteAtPosition.head, 40);
        linkedList_deleteAtPosition.head = linkedList_deleteAtPosition.add(linkedList_deleteAtPosition.head, 60);
        linkedList_deleteAtPosition.head = linkedList_deleteAtPosition.add(linkedList_deleteAtPosition.head, 80);

        linkedList_deleteAtPosition.display(linkedList_deleteAtPosition.head);

        linkedList_deleteAtPosition.head = linkedList_deleteAtPosition.deleteAtPosition(2, linkedList_deleteAtPosition.head);

        System.out.println();

        linkedList_deleteAtPosition.display(linkedList_deleteAtPosition.head);
    }
}
