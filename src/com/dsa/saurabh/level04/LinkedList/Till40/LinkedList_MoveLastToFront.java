package com.dsa.saurabh.level04.LinkedList.Till40;

public class LinkedList_MoveLastToFront {

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

    private void display(ListNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        display(node.next);
    }


    private ListNode moveLastToFront(ListNode node) {
        if (node == null) return null;

        ListNode temp = node;

        while (node.next.next != null) {
            node = node.next;
        }

        node.next.next = temp;
        temp = node.next;

        node.next = null;
        return temp;
    }


    public static void main(String[] args) {
        LinkedList_MoveLastToFront linkedList_moveLastToFront = new LinkedList_MoveLastToFront();
        linkedList_moveLastToFront.head = linkedList_moveLastToFront.add(linkedList_moveLastToFront.head, 10);
        linkedList_moveLastToFront.head = linkedList_moveLastToFront.add(linkedList_moveLastToFront.head, 20);
        linkedList_moveLastToFront.head = linkedList_moveLastToFront.add(linkedList_moveLastToFront.head, 30);
        linkedList_moveLastToFront.head = linkedList_moveLastToFront.add(linkedList_moveLastToFront.head, 40);
        linkedList_moveLastToFront.head = linkedList_moveLastToFront.add(linkedList_moveLastToFront.head, 50);

        linkedList_moveLastToFront.display(linkedList_moveLastToFront.head);

        ListNode listNode = linkedList_moveLastToFront.moveLastToFront(linkedList_moveLastToFront.head);

        System.out.println();

        linkedList_moveLastToFront.display(listNode);
    }
}
