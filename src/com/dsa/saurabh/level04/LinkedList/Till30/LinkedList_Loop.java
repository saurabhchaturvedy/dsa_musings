package com.dsa.saurabh.level04.LinkedList.Till30;

public class LinkedList_Loop {

    ListNode head;

    private class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    private boolean hasLoop(ListNode node) {
        if (node == null) {
            return false;
        }

        ListNode fast = node;
        ListNode slow = node;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }


    private ListNode add(ListNode node, int data)
    {
        if(node==null)
        {
            return setNewNode(data);
        }
        else
        {
            node.next = add(node.next,data);
        }
        return node;
    }

    private ListNode setNewNode(int data) {
        ListNode listNode = new ListNode(data);
        listNode.next=null;
        return listNode;
    }


    public static void main(String[] args) {
       LinkedList_Loop linkedList_loop = new LinkedList_Loop();
        linkedList_loop.head = linkedList_loop.add(linkedList_loop.head, 10);
        linkedList_loop.head = linkedList_loop.add(linkedList_loop.head, 20);
        linkedList_loop.head = linkedList_loop.add(linkedList_loop.head, 30);
        linkedList_loop.head = linkedList_loop.add(linkedList_loop.head, 40);

        linkedList_loop.head.next.next.next = linkedList_loop.head.next;

        System.out.println(linkedList_loop.hasLoop(linkedList_loop.head));
    }
}
