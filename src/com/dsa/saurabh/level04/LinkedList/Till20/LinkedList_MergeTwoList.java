package com.dsa.saurabh.level04.LinkedList.Till20;

public class LinkedList_MergeTwoList {


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

    public ListNode mergeSort(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        ListNode middle = middleNode(node);
        ListNode secondHalf = middle.next;
        middle.next = null;

        return merge(mergeSort(node), mergeSort(secondHalf));
    }

    public ListNode merge(ListNode a, ListNode b) {
        ListNode temp = new ListNode(0);
        ListNode finalList = temp;

        while (a != null && b != null) {
            if (a.data < b.data) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }
        temp.next = (a == null) ? b : a;
        return finalList.next;
    }


    public static void main(String[] args) {
        ListNode head1 = null;
        LinkedList_MergeTwoList a = new LinkedList_MergeTwoList();

        head1 = a.add(head1, 12);
        head1 = a.add(head1, 9);
        head1 = a.add(head1, 37);

        ListNode head2 = null;
        head2 = a.add(head2, 45);
        head2 = a.add(head2, 8);

        a.display(head1);
        System.out.println();

        a.display(head2);
        System.out.println();

        ListNode mergeList = a.merge(head1, head2);
        a.display(mergeList);
    }
}
