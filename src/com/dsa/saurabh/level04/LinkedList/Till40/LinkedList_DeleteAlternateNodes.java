package com.dsa.saurabh.level04.LinkedList.Till40;

public class LinkedList_DeleteAlternateNodes {

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

    private ListNode deleteAlternateNodes(ListNode node) {
        if (node == null) return null;

        ListNode temp = node;

        while (temp != null && temp.next != null) {
            temp.next = temp.next.next;
            temp = temp.next;
        }

        return node;
    }


    public static void main(String[] args) {
        LinkedList_DeleteAlternateNodes linkedList_deleteAlternateNodes = new LinkedList_DeleteAlternateNodes();
        linkedList_deleteAlternateNodes.head = linkedList_deleteAlternateNodes.add(linkedList_deleteAlternateNodes.head, 10);
        linkedList_deleteAlternateNodes.head = linkedList_deleteAlternateNodes.add(linkedList_deleteAlternateNodes.head, 20);
        linkedList_deleteAlternateNodes.head = linkedList_deleteAlternateNodes.add(linkedList_deleteAlternateNodes.head, 30);
        linkedList_deleteAlternateNodes.head = linkedList_deleteAlternateNodes.add(linkedList_deleteAlternateNodes.head, 40);
        linkedList_deleteAlternateNodes.head = linkedList_deleteAlternateNodes.add(linkedList_deleteAlternateNodes.head, 50);

        linkedList_deleteAlternateNodes.display(linkedList_deleteAlternateNodes.head);

        System.out.println();

        ListNode listNode = linkedList_deleteAlternateNodes.deleteAlternateNodes(linkedList_deleteAlternateNodes.head);

        System.out.println();

        linkedList_deleteAlternateNodes.display(listNode);
    }
}
