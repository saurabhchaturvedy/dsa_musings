package com.dsa.saurabh.level04.LinkedList.Till40;

public class LinkedList_DeleteList {


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

    private ListNode deleteList() {
        return null;
    }

    private void display(ListNode node) {
        if (node == null) return;
        System.out.println(node.data + " ");
        display(node.next);
    }

    public static void main(String[] args) {
        LinkedList_DeleteList linkedList_deleteList = new LinkedList_DeleteList();
        linkedList_deleteList.head = linkedList_deleteList.add(linkedList_deleteList.head, 10);
        linkedList_deleteList.head = linkedList_deleteList.add(linkedList_deleteList.head, 20);
        linkedList_deleteList.head = linkedList_deleteList.add(linkedList_deleteList.head, 30);
        linkedList_deleteList.head = linkedList_deleteList.add(linkedList_deleteList.head, 40);

        linkedList_deleteList.head = linkedList_deleteList.deleteList();
        linkedList_deleteList.display(linkedList_deleteList.head);
    }
}
