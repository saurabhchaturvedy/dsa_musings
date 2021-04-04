package com.dsa.saurabh.level04.LinkedList.Till50;

public class LinkedList_Reverse {

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

    private ListNode reverse(ListNode node) {
        if (node == null) {
            return node;
        }

        ListNode current = node;
        ListNode previous = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }


    private void display(ListNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        display(node.next);
    }


    public static void main(String[] args) {
        LinkedList_Reverse linkedList_reverse = new LinkedList_Reverse();
        linkedList_reverse.head = linkedList_reverse.add(linkedList_reverse.head, 10);
        linkedList_reverse.head = linkedList_reverse.add(linkedList_reverse.head, 20);
        linkedList_reverse.head = linkedList_reverse.add(linkedList_reverse.head, 30);
        linkedList_reverse.head = linkedList_reverse.add(linkedList_reverse.head, 40);
        linkedList_reverse.head = linkedList_reverse.add(linkedList_reverse.head, 50);

        System.out.println("displaying list : ");

        linkedList_reverse.display(linkedList_reverse.head);

        System.out.println();

        ListNode reverse = linkedList_reverse.reverse(linkedList_reverse.head);

        System.out.println("reversing the list : ");

        linkedList_reverse.display(reverse);
    }
}
