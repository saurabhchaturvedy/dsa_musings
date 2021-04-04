package com.dsa.saurabh.level01.LinkedList_CS;

public class LinkedList_SwapPairs {

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

  //  1->2->3->4->5->6->7->8

    private ListNode swapPairs(ListNode node)
    {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head, prev = null;

        // consider two nodes at a time and swap their links
        while (curr != null && curr.next != null)
        {
            ListNode temp = curr.next;
            curr.next = temp.next;
            temp.next = curr;

            if (prev == null) {
                head = temp;
            }
            else {
                prev.next = temp;
            }

            prev = curr;
            curr = curr.next;
        }

        return head;
    }

    private void display(ListNode node)
    {
        if(node==null)
        {
            return;
        }

        System.out.print(node.data+" ");
        display(node.next);
    }


    public static void main(String[] args) {
        LinkedList_SwapPairs linkedList_swapPairs = new LinkedList_SwapPairs();
        linkedList_swapPairs.head = linkedList_swapPairs.add(linkedList_swapPairs.head,1);
        linkedList_swapPairs.head = linkedList_swapPairs.add(linkedList_swapPairs.head,2);
        linkedList_swapPairs.head = linkedList_swapPairs.add(linkedList_swapPairs.head,3);
        linkedList_swapPairs.head = linkedList_swapPairs.add(linkedList_swapPairs.head,4);
        linkedList_swapPairs.head = linkedList_swapPairs.add(linkedList_swapPairs.head,5);
        linkedList_swapPairs.head = linkedList_swapPairs.add(linkedList_swapPairs.head,6);
        linkedList_swapPairs.head = linkedList_swapPairs.add(linkedList_swapPairs.head,7);

        linkedList_swapPairs.display(linkedList_swapPairs.head);
        ListNode listNode = linkedList_swapPairs.swapPairs(linkedList_swapPairs.head);

        System.out.println();
        linkedList_swapPairs.display(listNode);
    }
}
