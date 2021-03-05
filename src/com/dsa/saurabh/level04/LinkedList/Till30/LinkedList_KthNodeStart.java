package com.dsa.saurabh.level04.LinkedList.Till30;

public class LinkedList_KthNodeStart {

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
        ListNode node = new ListNode(data);
        node.next = null;
        return node;
    }

    private ListNode KthNodeFromStart(ListNode node, int k) {
        if (node == null) return null;

        ListNode temp = node;
        int count = 0;
        while (count < k - 1) {
            if (temp.next == null) {
                throw new RuntimeException("element does not exist");
            }
            temp = temp.next;
            count++;
        }

        return temp;
    }

    private void display(ListNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        display(node.next);
    }

    public static void main(String[] args) {
        LinkedList_KthNodeStart linkedList_kthNodeStart = new LinkedList_KthNodeStart();
        linkedList_kthNodeStart.head = linkedList_kthNodeStart.add(linkedList_kthNodeStart.head, 10);
        linkedList_kthNodeStart.head = linkedList_kthNodeStart.add(linkedList_kthNodeStart.head, 20);
        linkedList_kthNodeStart.head = linkedList_kthNodeStart.add(linkedList_kthNodeStart.head, 30);
        linkedList_kthNodeStart.head = linkedList_kthNodeStart.add(linkedList_kthNodeStart.head, 40);
        linkedList_kthNodeStart.head = linkedList_kthNodeStart.add(linkedList_kthNodeStart.head, 50);
        linkedList_kthNodeStart.head = linkedList_kthNodeStart.add(linkedList_kthNodeStart.head, 60);

        linkedList_kthNodeStart.display(linkedList_kthNodeStart.head);

        System.out.println();

        System.out.println(linkedList_kthNodeStart.KthNodeFromStart(linkedList_kthNodeStart.head, 4).data);
    }
}
