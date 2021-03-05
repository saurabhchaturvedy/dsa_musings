package com.dsa.saurabh.level04.LinkedList.Till30;

public class LinkedList_RemoveDuplicatesUnsorted {

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

    private ListNode removeDuplicates(ListNode node) {
        if (node == null || node.next == null) return null;
        ListNode listNode = mergeSort(node);
        if (listNode.data == listNode.next.data) {
            listNode.next = listNode.next.next;
            removeDuplicates(listNode);
        } else {
            removeDuplicates(listNode.next);
        }
        return node;
    }

    private ListNode mergeSort(ListNode node) {
        if (node == null || node.next==null) return node;
        ListNode middleNode = middle(node);
        ListNode secondHalf = middleNode.next;
        middleNode.next = null;
        return mergeLists(mergeSort(node), mergeSort(secondHalf));


    }

    private ListNode mergeLists(ListNode first, ListNode second) {
        ListNode temp = new ListNode(0);
        ListNode finalList = temp;

        while (first != null && second != null) {
            if (first.data < second.data) {
                temp.next = first;
                first = first.next;
            } else if (second.data < first.data) {
                temp.next = second;
                second = second.next;
            }

            temp = temp.next;
        }

        temp.next = (first == null) ? second : first;
        return finalList.next;
    }

    private ListNode middle(ListNode node) {
        if (node == null) return null;

        ListNode fast = node;
        ListNode slow = node;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    private void display(ListNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        display(node.next);
    }

    public static void main(String[] args) {

        LinkedList_RemoveDuplicatesUnsorted linkedList_removeDuplicatesUnsorted = new LinkedList_RemoveDuplicatesUnsorted();
        linkedList_removeDuplicatesUnsorted.head = linkedList_removeDuplicatesUnsorted.add(linkedList_removeDuplicatesUnsorted.head, 10);
        linkedList_removeDuplicatesUnsorted.head = linkedList_removeDuplicatesUnsorted.add(linkedList_removeDuplicatesUnsorted.head, 20);
        linkedList_removeDuplicatesUnsorted.head = linkedList_removeDuplicatesUnsorted.add(linkedList_removeDuplicatesUnsorted.head, 10);
        linkedList_removeDuplicatesUnsorted.head = linkedList_removeDuplicatesUnsorted.add(linkedList_removeDuplicatesUnsorted.head, 30);
        linkedList_removeDuplicatesUnsorted.head = linkedList_removeDuplicatesUnsorted.add(linkedList_removeDuplicatesUnsorted.head, 20);

        linkedList_removeDuplicatesUnsorted.display(linkedList_removeDuplicatesUnsorted.head);

        linkedList_removeDuplicatesUnsorted.head = linkedList_removeDuplicatesUnsorted.removeDuplicates(linkedList_removeDuplicatesUnsorted.head);

        linkedList_removeDuplicatesUnsorted.display(linkedList_removeDuplicatesUnsorted.head);

    }
}
