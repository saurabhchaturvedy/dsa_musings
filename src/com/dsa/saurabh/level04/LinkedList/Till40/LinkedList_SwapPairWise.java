package com.dsa.saurabh.level04.LinkedList.Till40;

public class LinkedList_SwapPairWise {

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

    private void display(ListNode node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        display(node.next);
    }

    private ListNode swapPairWise(ListNode node) {
        ListNode temp = node;

        while (temp != null && temp.next != null) {
            int data = temp.data;
            temp.data = temp.next.data;
            temp.next.data = data;

            temp = temp.next.next;
        }

        return node;
    }

    public static void main(String[] args) {
        LinkedList_SwapPairWise linkedList_swapPairWise = new LinkedList_SwapPairWise();
        linkedList_swapPairWise.head = linkedList_swapPairWise.add(linkedList_swapPairWise.head, 10);
        linkedList_swapPairWise.head = linkedList_swapPairWise.add(linkedList_swapPairWise.head, 20);
        linkedList_swapPairWise.head = linkedList_swapPairWise.add(linkedList_swapPairWise.head, 30);
        linkedList_swapPairWise.head = linkedList_swapPairWise.add(linkedList_swapPairWise.head, 40);
        linkedList_swapPairWise.head = linkedList_swapPairWise.add(linkedList_swapPairWise.head, 50);

        linkedList_swapPairWise.display(linkedList_swapPairWise.head);

        ListNode listNode = linkedList_swapPairWise.swapPairWise(linkedList_swapPairWise.head);

        System.out.println();

        linkedList_swapPairWise.display(listNode);
    }
}
