package com.dsa.saurabh.level04.LinkedList.Till10;

public class LinkedList_Size {


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

    private int size(ListNode node) {
        if (node == null) return 0;
        return 1 + size(node.next);
    }

    public static void main(String[] args) {
        LinkedList_Size linkedList_size = new LinkedList_Size();
        linkedList_size.head = linkedList_size.add(linkedList_size.head, 20);
        linkedList_size.head = linkedList_size.add(linkedList_size.head, 40);
        linkedList_size.head = linkedList_size.add(linkedList_size.head, 60);
        linkedList_size.head = linkedList_size.add(linkedList_size.head, 80);

        System.out.println(linkedList_size.size(linkedList_size.head));


    }
}
