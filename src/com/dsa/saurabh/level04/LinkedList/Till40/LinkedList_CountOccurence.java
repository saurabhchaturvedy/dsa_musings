package com.dsa.saurabh.level04.LinkedList.Till40;

public class LinkedList_CountOccurence {

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

    private int countOccurence(ListNode node, int data) {
        if (node == null) return 0;

        ListNode temp = node;

        int count = 0;

        while (temp != null) {
            if (temp.data == data) {
                count++;
            }

            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {
        LinkedList_CountOccurence linkedList_countOccurence = new LinkedList_CountOccurence();
        linkedList_countOccurence.head = linkedList_countOccurence.add(linkedList_countOccurence.head, 10);
        linkedList_countOccurence.head = linkedList_countOccurence.add(linkedList_countOccurence.head, 20);
        linkedList_countOccurence.head = linkedList_countOccurence.add(linkedList_countOccurence.head, 30);
        linkedList_countOccurence.head = linkedList_countOccurence.add(linkedList_countOccurence.head, 10);
        linkedList_countOccurence.head = linkedList_countOccurence.add(linkedList_countOccurence.head, 10);

        int i = linkedList_countOccurence.countOccurence(linkedList_countOccurence.head, 10);
        System.out.println("count of 10 is " + i);
    }
}
