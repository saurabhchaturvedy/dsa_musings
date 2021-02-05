package com.dsa.saurabh.level01.LinkedList_CS;

import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class LinkedList_Intersection {

    ListNode head;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return data == listNode.data;
        }

        @Override
        public int hashCode() {
            return Objects.hash(data);
        }
    }


    private static ListNode findIntersection(ListNode first, ListNode second) {
        Set<ListNode> nodeSet = new HashSet<>();

        while (first != null) {
            nodeSet.add(first);
            first = first.next;
        }

        while (second != null) {
            if (nodeSet.contains(second)) {
                return second;
            }
            second = second.next;
        }
        return null;
    }


    public static void main(String[] args) {

        LinkedList_Intersection linkedList_intersection = new LinkedList_Intersection();
        linkedList_intersection.head = new LinkedList_Intersection.ListNode(3);
        LinkedList_Intersection.ListNode second = new LinkedList_Intersection.ListNode(6);
        LinkedList_Intersection.ListNode third = new LinkedList_Intersection.ListNode(8);

        linkedList_intersection.head.next = second;
        second.next = third;

        LinkedList_Intersection.ListNode one = new LinkedList_Intersection.ListNode(1);
        LinkedList_Intersection.ListNode two = new LinkedList_Intersection.ListNode(6);
        LinkedList_Intersection.ListNode three = new LinkedList_Intersection.ListNode(7);
        one.next = two;
        two.next = three;

        ListNode intersection = findIntersection(linkedList_intersection.head, one);
        System.out.println("Intersection is at : " + intersection.data == null ? null : intersection.data);
    }
}
