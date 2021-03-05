package com.dsa.saurabh.level04.LinkedList.Till30;

public class LinkedList_DeleteMiddleNode {

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
        ListNode listNode = new ListNode(data);
        listNode.next = null;
        return listNode;
    }


    private ListNode deleteMiddleNode(ListNode node) {
        if (node == null) return null;

        ListNode fast = node;
        ListNode slow = node;
        ListNode previous = node;

        while (fast != null && fast.next != null) {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        previous.next = slow.next;
        return node;
    }


    private void display(ListNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        display(node.next);
    }


    public static void main(String[] args) {
        LinkedList_DeleteMiddleNode linkedList_deleteMiddleNode = new LinkedList_DeleteMiddleNode();
        linkedList_deleteMiddleNode.head = linkedList_deleteMiddleNode.add(linkedList_deleteMiddleNode.head, 10);
        linkedList_deleteMiddleNode.head = linkedList_deleteMiddleNode.add(linkedList_deleteMiddleNode.head, 20);
        linkedList_deleteMiddleNode.head = linkedList_deleteMiddleNode.add(linkedList_deleteMiddleNode.head, 30);
        linkedList_deleteMiddleNode.head = linkedList_deleteMiddleNode.add(linkedList_deleteMiddleNode.head, 40);
        linkedList_deleteMiddleNode.head = linkedList_deleteMiddleNode.add(linkedList_deleteMiddleNode.head, 50);
        linkedList_deleteMiddleNode.head = linkedList_deleteMiddleNode.add(linkedList_deleteMiddleNode.head, 60);
      //  linkedList_deleteMiddleNode.head = linkedList_deleteMiddleNode.add(linkedList_deleteMiddleNode.head, 70);

        linkedList_deleteMiddleNode.display(linkedList_deleteMiddleNode.head);

        ListNode listNode = linkedList_deleteMiddleNode.deleteMiddleNode(linkedList_deleteMiddleNode.head);

        System.out.println();

        linkedList_deleteMiddleNode.display(listNode);
    }
}
