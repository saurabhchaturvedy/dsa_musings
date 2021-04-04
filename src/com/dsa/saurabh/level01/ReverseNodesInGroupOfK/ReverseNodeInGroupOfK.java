package com.dsa.saurabh.level01.ReverseNodesInGroupOfK;

public class ReverseNodeInGroupOfK {

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

    private ListNode reverseNodesInGroupK(ListNode node, int k) {
        if (node == null) return node;

        ListNode current = node;
        ListNode previous = null;
        ListNode next = null;

        int i = 0;

        while (current != null && i < k) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            i++;
        }

        if (next != null) {
            node.next = reverseNodesInGroupK(next, k);
        }

        return previous;
    }

    private void display(ListNode node)
    {
        if(node==null)
            return;
        System.out.print(node.data+" ");
        display(node.next);
    }

    public static void main(String[] args) {
        ReverseNodeInGroupOfK reverseNodeInGroupOfK = new ReverseNodeInGroupOfK();
        reverseNodeInGroupOfK.head = reverseNodeInGroupOfK.add(reverseNodeInGroupOfK.head, 10);
        reverseNodeInGroupOfK.head = reverseNodeInGroupOfK.add(reverseNodeInGroupOfK.head, 20);
        reverseNodeInGroupOfK.head = reverseNodeInGroupOfK.add(reverseNodeInGroupOfK.head, 30);
        reverseNodeInGroupOfK.head = reverseNodeInGroupOfK.add(reverseNodeInGroupOfK.head, 40);

        reverseNodeInGroupOfK.display(reverseNodeInGroupOfK.head);

        System.out.println();

        ListNode listNode = reverseNodeInGroupOfK.reverseNodesInGroupK(reverseNodeInGroupOfK.head, 2);

        System.out.println();

        reverseNodeInGroupOfK.display(listNode);
    }
}
