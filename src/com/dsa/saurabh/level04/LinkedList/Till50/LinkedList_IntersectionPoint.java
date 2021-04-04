package com.dsa.saurabh.level04.LinkedList.Till50;

public class LinkedList_IntersectionPoint {


    private ListNode head;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
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


    private int intersectionPoint(ListNode node1,ListNode node2)
    {
        if(node1 == null || node2 == null) {
            return -1;
        }

        ListNode head1 = node1, head2 = node2;

        int count1 = 0, count2 = 0;
        while(node1 != null) {
            count1++;
            node1 = node1.next;
        }

        while(node2 != null) {
            count2++;
            node2 = node2.next;
        }

        int v = count1 - count2;
        while(v > 0) {
            head1 = head1.next;
            v--;
        }

        while(v < 0) {
            head2 = head2.next;
            v++;
        }

        while(head1 != null && head2 != null) {
            if(head1.data == head2.data) {
                return head1.data;
            }

            head1 = head1.next;
            head2 = head2.next;
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}
