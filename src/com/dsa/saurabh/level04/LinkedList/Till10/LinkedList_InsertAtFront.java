package com.dsa.saurabh.level04.LinkedList.Till10;

public class LinkedList_InsertAtFront {


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

    private void display() {
        if (head == null) return;
        System.out.print(head.data + " ");
        head = head.next;
        display();
    }

    private void insertAtFront(int data) {
        ListNode listNode = new ListNode(data);
        listNode.next = head;
        head = listNode;
    }

    public static void main(String[] args) {
        LinkedList_InsertAtFront linkedList_insertAtFront = new LinkedList_InsertAtFront();
        linkedList_insertAtFront.head = linkedList_insertAtFront.add(linkedList_insertAtFront.head, 20);
        linkedList_insertAtFront.head = linkedList_insertAtFront.add(linkedList_insertAtFront.head, 40);
        linkedList_insertAtFront.head = linkedList_insertAtFront.add(linkedList_insertAtFront.head, 60);
        linkedList_insertAtFront.head = linkedList_insertAtFront.add(linkedList_insertAtFront.head, 80);
        linkedList_insertAtFront.insertAtFront(67);
        linkedList_insertAtFront.display();
    }
}
