package com.dsa.saurabh.level04.LinkedList.Till10;

import java.util.Optional;

public class LinkedList_Search {


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

    private ListNode search(ListNode node, int data) {
        if (node == null || node.data == data) return node;
        return search(node.next, data);


    }


    public static void main(String[] args) {
        LinkedList_Search linkedList_search = new LinkedList_Search();

        linkedList_search.head = linkedList_search.add(linkedList_search.head, 20);
        linkedList_search.head = linkedList_search.add(linkedList_search.head, 40);
        linkedList_search.head = linkedList_search.add(linkedList_search.head, 60);
        linkedList_search.head = linkedList_search.add(linkedList_search.head, 80);


        linkedList_search.display(linkedList_search.head);

        System.out.println();

        System.out.println(Optional.of(linkedList_search.search(linkedList_search.head, 40).data));

    }
}
