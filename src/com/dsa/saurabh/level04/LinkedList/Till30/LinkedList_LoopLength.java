package com.dsa.saurabh.level04.LinkedList.Till30;

public class LinkedList_LoopLength {

    ListNode head;

    private class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    private int loopLength(ListNode node) {
        if (node == null) {
            return -1;
        }

        ListNode fast = node;
        ListNode slow = node;
        int length=0;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
               break;
            }
        }
        if(slow == fast) {
            while(slow.next != fast) {
                slow = slow.next;
                length++;
            }
            length++;
        }

      return length;
    }

    private int getLoopLength(ListNode slow, ListNode fast) {

        ListNode temp = slow;
        int count = 1;
        while (temp.next!=slow)
        {
            temp = temp.next;
            count++;
        }

        return count;
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


    public static void main(String[] args) {
        LinkedList_LoopLength linkedList_loopLength = new LinkedList_LoopLength();
        linkedList_loopLength.head = linkedList_loopLength.add(linkedList_loopLength.head, 10);
        linkedList_loopLength.head = linkedList_loopLength.add(linkedList_loopLength.head, 20);
        linkedList_loopLength.head = linkedList_loopLength.add(linkedList_loopLength.head, 30);
        linkedList_loopLength.head = linkedList_loopLength.add(linkedList_loopLength.head, 40);

        linkedList_loopLength.head.next.next.next = linkedList_loopLength.head.next;

        System.out.println(linkedList_loopLength.loopLength(linkedList_loopLength.head));
    }
}
