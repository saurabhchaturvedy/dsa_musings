package com.dsa.saurabh.level01.FindStartNodeOftheLinkedListLoop;

import com.dsa.saurabh.level01.Tries.Node;

public class LinkedList {

    private ListNode head;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }


    private static ListNode detectLoopAndFindFirstNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        ListNode start = null;
        boolean isLoopFirstNodeFound = false;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // loop is detected , lets find the first node
                start = head;
                while (start != slow) {
                    start = start.next;
                    slow = slow.next;
                }
                isLoopFirstNodeFound = true;
                while (fast.next!=slow)
                {
                    fast = fast.next;
                }
                fast.next=null;
            }
            if (isLoopFirstNodeFound)
                break;
        }
        return start;
    }

    private static void display(ListNode head)
    {
        ListNode current = head;
        while(current!=null)
        {
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);

        linkedList.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;
      //  display(linkedList.head);

        ListNode listNode = detectLoopAndFindFirstNode(linkedList.head);
        System.out.println(listNode.data);
        display(linkedList.head);

    }
}
