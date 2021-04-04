package com.dsa.saurabh.level04.LinkedList.Till50;

public class LinkedList_SwapPairwise {


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

    private ListNode swapPairWise(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        ListNode head = node.next;
        ListNode previous = node;
        node = node.next;
        ListNode next;

        while (node != null) {
            next = node.next;
            node.next = previous;

            if (next == null || next.next == null) {
                previous.next = next;
                break;
            }

            previous.next = next.next;
            previous = next;
            node = previous.next;

            display(head);
        }
        return head;
    }


    private void display(ListNode node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        display(node.next);
    }


    public static void main(String[] args) {
        LinkedList_SwapPairwise linkedList_swapPairWise = new LinkedList_SwapPairwise();
        linkedList_swapPairWise.head = linkedList_swapPairWise.add(linkedList_swapPairWise.head, 10);
        linkedList_swapPairWise.head = linkedList_swapPairWise.add(linkedList_swapPairWise.head, 20);
        linkedList_swapPairWise.head = linkedList_swapPairWise.add(linkedList_swapPairWise.head, 30);
        linkedList_swapPairWise.head = linkedList_swapPairWise.add(linkedList_swapPairWise.head, 40);
        linkedList_swapPairWise.head = linkedList_swapPairWise.add(linkedList_swapPairWise.head, 50);
        linkedList_swapPairWise.head = linkedList_swapPairWise.add(linkedList_swapPairWise.head, 60);


        System.out.println("displaying linked list ::");

        linkedList_swapPairWise.display(linkedList_swapPairWise.head);

        System.out.println();

        System.out.println();

        System.out.println("linked list after swapping....");

        ListNode listNode = linkedList_swapPairWise.swapPairWise(linkedList_swapPairWise.head);

        System.out.println();

        System.out.println("Displaying linked list ::");

        linkedList_swapPairWise.display(listNode);

    }
}
