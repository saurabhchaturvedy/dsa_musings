package com.dsa.saurabh.level04.LinkedList.Till40;

public class LinkedList_FirstSecondHalfMatch {

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

    private boolean isFirstHalfSecondHalfMatching(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode secondHalf = slow.next;

        while (secondHalf != null) {
            if (head.data != secondHalf.data) {
                return false;
            }

            secondHalf = secondHalf.next;
            head = head.next;
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedList_FirstSecondHalfMatch firstSecondHalfMatch = new LinkedList_FirstSecondHalfMatch();
        firstSecondHalfMatch.head = firstSecondHalfMatch.add(firstSecondHalfMatch.head, 10);
        firstSecondHalfMatch.head = firstSecondHalfMatch.add(firstSecondHalfMatch.head, 20);
        firstSecondHalfMatch.head = firstSecondHalfMatch.add(firstSecondHalfMatch.head, 30);
        firstSecondHalfMatch.head = firstSecondHalfMatch.add(firstSecondHalfMatch.head, 10);
        firstSecondHalfMatch.head = firstSecondHalfMatch.add(firstSecondHalfMatch.head, 20);

        boolean firstHalfSecondHalfMatching = firstSecondHalfMatch.isFirstHalfSecondHalfMatching(firstSecondHalfMatch.head);

        System.out.println("Is the first half matching ? : " + firstHalfSecondHalfMatching);

    }
}
