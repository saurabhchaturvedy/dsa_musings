package com.dsa.saurabh.level04.LinkedList.Till50;

public class LinkedList_ReverseInGroupOfKAlternative {


    private ListNode head;

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

    private ListNode reverseInGroupKAlternative(ListNode node, int k) {
        if (k <= 1 || node == null || node.next == null) {
            return node;
        }

        ListNode current = node;
        ListNode previous = null;
        ListNode next = null;

        int i = 0;

        while (current != null && i < k) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            i++;
        }

        i = 0;

        if (next != null) {
            node.next = next;
            current = next;

            while (current != null && i < k - 1) {
                current = current.next;
                i++;
            }

            if (current != null) {
                current.next = reverseInGroupKAlternative(current.next, k);
            }
        }

        return previous;
    }

    public static void main(String[] args) {
        LinkedList_ReverseInGroupOfKAlternative linkedList_reverseInGroupOfKAlternative = new LinkedList_ReverseInGroupOfKAlternative();
        linkedList_reverseInGroupOfKAlternative.head = linkedList_reverseInGroupOfKAlternative.add(linkedList_reverseInGroupOfKAlternative.head, 10);
        linkedList_reverseInGroupOfKAlternative.head = linkedList_reverseInGroupOfKAlternative.add(linkedList_reverseInGroupOfKAlternative.head, 20);
        linkedList_reverseInGroupOfKAlternative.head = linkedList_reverseInGroupOfKAlternative.add(linkedList_reverseInGroupOfKAlternative.head, 30);
        linkedList_reverseInGroupOfKAlternative.head = linkedList_reverseInGroupOfKAlternative.add(linkedList_reverseInGroupOfKAlternative.head, 40);
        linkedList_reverseInGroupOfKAlternative.head = linkedList_reverseInGroupOfKAlternative.add(linkedList_reverseInGroupOfKAlternative.head, 50);
        linkedList_reverseInGroupOfKAlternative.head = linkedList_reverseInGroupOfKAlternative.add(linkedList_reverseInGroupOfKAlternative.head, 60);

        System.out.println("displaying the list ====> ");

        linkedList_reverseInGroupOfKAlternative.display(linkedList_reverseInGroupOfKAlternative.head);

        System.out.println();

        System.out.println();

        ListNode listNode = linkedList_reverseInGroupOfKAlternative.reverseInGroupKAlternative(linkedList_reverseInGroupOfKAlternative.head, 2);

        System.out.println();

        System.out.println("reversing list alternatively in group of 2");

        linkedList_reverseInGroupOfKAlternative.display(listNode);
    }
}
