package com.dsa.saurabh.level04.LinkedList.Till20;

public class LinkedList_Sort {

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


    private ListNode middleNode(ListNode node) {
        if (node == null) return null;

        ListNode hare = node;
        ListNode tortoise = node;

        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
        }

        return tortoise;
    }

    private ListNode mergesort(ListNode node) {
        if (node == null || node.next == null) return node;

        ListNode middle = middleNode(node);
        ListNode secondHalf = middle.next;
        middle.next = null;
        return merge(mergesort(node), mergesort(secondHalf));
    }

    private ListNode merge(ListNode first, ListNode second) {
        ListNode temp = new ListNode(0);
        ListNode finalList = temp;

        while (first != null && second != null) {
            if (first.data < second.data) {
                temp.next = first;
                first = first.next;
            } else {
                temp.next = second;
                second = second.next;
            }

            temp = temp.next;
        }

        temp.next = (first == null) ? second : first;
        return finalList.next;
    }

    public static void main(String[] args) {
        LinkedList_Sort linkedList_sort = new LinkedList_Sort();
        linkedList_sort.head = linkedList_sort.add(linkedList_sort.head, 10);
        linkedList_sort.head = linkedList_sort.add(linkedList_sort.head, 30);
        linkedList_sort.head = linkedList_sort.add(linkedList_sort.head, 20);
        linkedList_sort.head = linkedList_sort.add(linkedList_sort.head, 40);
        linkedList_sort.head = linkedList_sort.add(linkedList_sort.head, 25);

        linkedList_sort.display(linkedList_sort.head);

        linkedList_sort.head = linkedList_sort.mergesort(linkedList_sort.head);

        System.out.println();

        linkedList_sort.display(linkedList_sort.head);
    }
}
