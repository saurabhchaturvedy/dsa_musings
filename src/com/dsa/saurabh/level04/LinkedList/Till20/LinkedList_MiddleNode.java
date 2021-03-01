package com.dsa.saurabh.level04.LinkedList.Till20;

public class LinkedList_MiddleNode {


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

    private ListNode middleNode(ListNode node) {
        if (node == null) return null;

        ListNode hare = node;
        ListNode tortoise = node;

        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
        }

        return tortoise;
    }

    public static void main(String[] args) {
        LinkedList_MiddleNode linkedList_middleNode = new LinkedList_MiddleNode();
        linkedList_middleNode.head = linkedList_middleNode.add(linkedList_middleNode.head, 10);
        linkedList_middleNode.head = linkedList_middleNode.add(linkedList_middleNode.head, 20);
        linkedList_middleNode.head = linkedList_middleNode.add(linkedList_middleNode.head, 30);
        linkedList_middleNode.head = linkedList_middleNode.add(linkedList_middleNode.head, 40);
        linkedList_middleNode.head = linkedList_middleNode.add(linkedList_middleNode.head, 50);

        linkedList_middleNode.display(linkedList_middleNode.head);

        System.out.println();

        ListNode middleNode = linkedList_middleNode.middleNode(linkedList_middleNode.head);

        System.out.println();

        System.out.println("Middle node " + middleNode.data);
    }
}
