package com.dsa.saurabh.level04.LinkedList.Till20;

public class LinkedList_RemoveDuplicate {

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


    private ListNode removeDuplicates(ListNode node) {
        if (node == null || node.next == null) return node;

        if (node.data == node.next.data) {
            node.next = node.next.next;
            removeDuplicates(node);
        } else {
            removeDuplicates(node.next);
        }

        return node;
    }


    public static void main(String[] args) {
        LinkedList_RemoveDuplicate linkedList_removeDuplicate = new LinkedList_RemoveDuplicate();
        linkedList_removeDuplicate.head = linkedList_removeDuplicate.add(linkedList_removeDuplicate.head, 10);
        linkedList_removeDuplicate.head = linkedList_removeDuplicate.add(linkedList_removeDuplicate.head, 20);
        linkedList_removeDuplicate.head = linkedList_removeDuplicate.add(linkedList_removeDuplicate.head, 30);
        linkedList_removeDuplicate.head = linkedList_removeDuplicate.add(linkedList_removeDuplicate.head, 40);
        linkedList_removeDuplicate.head = linkedList_removeDuplicate.add(linkedList_removeDuplicate.head, 40);
        linkedList_removeDuplicate.head = linkedList_removeDuplicate.add(linkedList_removeDuplicate.head, 40);

        linkedList_removeDuplicate.display(linkedList_removeDuplicate.head);

        System.out.println();

        linkedList_removeDuplicate.head = linkedList_removeDuplicate.removeDuplicates(linkedList_removeDuplicate.head);

        System.out.println();

        linkedList_removeDuplicate.display(linkedList_removeDuplicate.head);


    }
}
