package com.dsa.saurabh.level04.LinkedList.Till10;

public class LinkedList_DeleteLast {

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

    public static void main(String[] args) {

        LinkedList_DeleteLast linkedList_deleteLast = new LinkedList_DeleteLast();
        linkedList_deleteLast.head = linkedList_deleteLast.add(linkedList_deleteLast.head, 20);



        linkedList_deleteLast.display(linkedList_deleteLast.head);

        linkedList_deleteLast.head = linkedList_deleteLast.deleteLast(linkedList_deleteLast.head);

        System.out.println();

        linkedList_deleteLast.display(linkedList_deleteLast.head);


    }
}
