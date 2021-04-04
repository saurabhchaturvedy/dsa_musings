package com.dsa.saurabh.level04.LinkedList.Till50;

public class LinkedList_SwapPairwise2 {


    private ListNode head;

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


    private ListNode swapPairWise2(ListNode node) {

        ListNode previous = new ListNode(0);
        previous.next = node;
        ListNode newHead = previous;
        ListNode p1;
        ListNode p2;
        ListNode nextNode;

        while (previous.next != null && previous.next.next != null) {
            p1 = previous.next;
            p2 = p1.next;
            nextNode = p2.next;

            previous.next = p2;
            p2.next = p1;
            p1.next = nextNode;
            previous = p1;
        }

        return newHead.next;
    }

    private void display(ListNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        display(node.next);
    }

    public static void main(String[] args) {
        LinkedList_SwapPairwise2 linkedList_swapPairwise2 = new LinkedList_SwapPairwise2();
        linkedList_swapPairwise2.head = linkedList_swapPairwise2.add(linkedList_swapPairwise2.head, 10);
        linkedList_swapPairwise2.head = linkedList_swapPairwise2.add(linkedList_swapPairwise2.head, 20);
        linkedList_swapPairwise2.head = linkedList_swapPairwise2.add(linkedList_swapPairwise2.head, 30);
        linkedList_swapPairwise2.head = linkedList_swapPairwise2.add(linkedList_swapPairwise2.head, 40);
        linkedList_swapPairwise2.head = linkedList_swapPairwise2.add(linkedList_swapPairwise2.head, 50);
        linkedList_swapPairwise2.head = linkedList_swapPairwise2.add(linkedList_swapPairwise2.head, 60);

        System.out.println("displaying linked list ::");

        linkedList_swapPairwise2.display(linkedList_swapPairwise2.head);

        System.out.println();

        ListNode listNode = linkedList_swapPairwise2.swapPairWise2(linkedList_swapPairwise2.head);

        System.out.println();

        System.out.println("pair-wise swapping of adjacent nodes");

        linkedList_swapPairwise2.display(listNode);


    }
}
