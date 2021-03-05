package com.dsa.saurabh.level04.LinkedList.Till30;

public class LinkedList_KthNodeLast {

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

    private ListNode kthNodeFromLast(ListNode node, int k) {
        if (node == null || k < 0) return null;

        ListNode mainPtr = node;
        ListNode refPtr = node;

        int count = 0;

        while (count < k) {
            if (refPtr.next == null) {
                throw new RuntimeException("K is not valid");
            }

            refPtr = refPtr.next;
            count++;
        }

        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }

        return mainPtr;
    }


    private void display(ListNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        display(node.next);
    }

    public static void main(String[] args) {

        LinkedList_KthNodeLast linkedList_kthNodeLast = new LinkedList_KthNodeLast();
        linkedList_kthNodeLast.head = linkedList_kthNodeLast.add(linkedList_kthNodeLast.head, 10);
        linkedList_kthNodeLast.head = linkedList_kthNodeLast.add(linkedList_kthNodeLast.head, 20);
        linkedList_kthNodeLast.head = linkedList_kthNodeLast.add(linkedList_kthNodeLast.head, 30);
        linkedList_kthNodeLast.head = linkedList_kthNodeLast.add(linkedList_kthNodeLast.head, 40);
        linkedList_kthNodeLast.head = linkedList_kthNodeLast.add(linkedList_kthNodeLast.head, 50);
        linkedList_kthNodeLast.head = linkedList_kthNodeLast.add(linkedList_kthNodeLast.head, 60);
        linkedList_kthNodeLast.head = linkedList_kthNodeLast.add(linkedList_kthNodeLast.head, 70);

        linkedList_kthNodeLast.display(linkedList_kthNodeLast.head);

        System.out.println();

        ListNode listNode = linkedList_kthNodeLast.kthNodeFromLast(linkedList_kthNodeLast.head, 5);

        System.out.println("Node is : " + listNode.data);

    }
}
