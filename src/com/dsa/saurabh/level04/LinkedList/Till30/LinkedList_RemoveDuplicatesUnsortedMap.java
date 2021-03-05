package com.dsa.saurabh.level04.LinkedList.Till30;

import java.util.HashMap;
import java.util.Map;

public class LinkedList_RemoveDuplicatesUnsortedMap {


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

    private ListNode removeDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode temp = head;
        ListNode previous = null;

        Map<Integer, Integer> map = new HashMap<>();

        while (temp != null) {
            if (!map.containsKey(temp.data)) {
                map.put(temp.data, 1);
                previous = temp;
            } else {
                previous.next = temp.next;
            }

            temp = temp.next;
        }
        return head;
    }

    private void display(ListNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        display(node.next);
    }


    public static void main(String[] args) {

        LinkedList_RemoveDuplicatesUnsortedMap linkedList_removeDuplicatesUnsortedMap = new LinkedList_RemoveDuplicatesUnsortedMap();
        linkedList_removeDuplicatesUnsortedMap.head = linkedList_removeDuplicatesUnsortedMap.add(linkedList_removeDuplicatesUnsortedMap.head, 10);
        linkedList_removeDuplicatesUnsortedMap.head = linkedList_removeDuplicatesUnsortedMap.add(linkedList_removeDuplicatesUnsortedMap.head, 70);
        linkedList_removeDuplicatesUnsortedMap.head = linkedList_removeDuplicatesUnsortedMap.add(linkedList_removeDuplicatesUnsortedMap.head, 20);
        linkedList_removeDuplicatesUnsortedMap.head = linkedList_removeDuplicatesUnsortedMap.add(linkedList_removeDuplicatesUnsortedMap.head, 10);
        linkedList_removeDuplicatesUnsortedMap.head = linkedList_removeDuplicatesUnsortedMap.add(linkedList_removeDuplicatesUnsortedMap.head, 30);
        linkedList_removeDuplicatesUnsortedMap.head = linkedList_removeDuplicatesUnsortedMap.add(linkedList_removeDuplicatesUnsortedMap.head, 20);
        linkedList_removeDuplicatesUnsortedMap.head = linkedList_removeDuplicatesUnsortedMap.add(linkedList_removeDuplicatesUnsortedMap.head, 80);

        linkedList_removeDuplicatesUnsortedMap.display(linkedList_removeDuplicatesUnsortedMap.head);

        ListNode listNode = linkedList_removeDuplicatesUnsortedMap.removeDuplicates(linkedList_removeDuplicatesUnsortedMap.head);

        System.out.println();

        linkedList_removeDuplicatesUnsortedMap.display(listNode);

    }
}
