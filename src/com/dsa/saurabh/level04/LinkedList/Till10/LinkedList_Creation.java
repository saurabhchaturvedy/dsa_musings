package com.dsa.saurabh.level04.LinkedList.Till10;

import java.util.LinkedList;

public class LinkedList_Creation {


    ListNode head;


    private class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }


    public ListNode setNewNode(int data) {
        ListNode node = new ListNode(data);
        node.next = null;
        return node;
    }

    /*
     * insert method is used to insert the element in Linked List
     */
    public ListNode add(ListNode node, int data) {
        if (node == null)
            return setNewNode(data);
        else {
            node.next = add(node.next, data);
        }
        return node;
    }

//
//    private void display() {
//        if (head == null) return;
//        System.out.print(head.data + " ");
//        head = head.next;
//        display();
//    }


    public static void main(String[] args) {
        LinkedList_Creation linkedList_creation = new LinkedList_Creation();
        linkedList_creation.head = linkedList_creation.add(linkedList_creation.head, 40);
        linkedList_creation.head = linkedList_creation.add(linkedList_creation.head, 80);
        linkedList_creation.head = linkedList_creation.add(linkedList_creation.head, 30);
        linkedList_creation.head = linkedList_creation.add(linkedList_creation.head, 20);
        linkedList_creation.head = linkedList_creation.add(linkedList_creation.head, 70);
//        linkedList_creation.display();


    }
}
