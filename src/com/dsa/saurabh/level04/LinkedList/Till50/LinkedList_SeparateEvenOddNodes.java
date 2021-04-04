package com.dsa.saurabh.level04.LinkedList.Till50;

public class LinkedList_SeparateEvenOddNodes {

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

    private ListNode separateEvenOddNodes(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        ListNode temp = node;

        ListNode evenStartingNode = null;
        ListNode evenEndNode = null;

        ListNode oddStartingNode = null;
        ListNode oddEndNode = null;

        while (temp != null) {
            if (temp.data % 2 == 0) {
                if (evenStartingNode == null) {
                    evenStartingNode = temp;
                    evenEndNode = evenStartingNode;
                } else {
                    evenEndNode.next = temp;
                    evenEndNode = evenEndNode.next;
                }
            } else {
                if (oddStartingNode == null) {
                    oddStartingNode = temp;
                    oddEndNode = oddStartingNode;
                } else {
                    oddEndNode.next = temp;
                    oddEndNode = oddEndNode.next;
                }
            }

            temp = temp.next;
        }

        evenEndNode.next = oddStartingNode;
        oddEndNode.next = null;

        return evenStartingNode;
    }

    private void display(ListNode node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        display(node.next);
    }

    public static void main(String[] args) {
        LinkedList_SeparateEvenOddNodes linkedList_separateEvenOddNodes = new LinkedList_SeparateEvenOddNodes();
        linkedList_separateEvenOddNodes.head = linkedList_separateEvenOddNodes.add(linkedList_separateEvenOddNodes.head, 10);
        linkedList_separateEvenOddNodes.head = linkedList_separateEvenOddNodes.add(linkedList_separateEvenOddNodes.head, 21);
        linkedList_separateEvenOddNodes.head = linkedList_separateEvenOddNodes.add(linkedList_separateEvenOddNodes.head, 20);
        linkedList_separateEvenOddNodes.head = linkedList_separateEvenOddNodes.add(linkedList_separateEvenOddNodes.head, 33);
        linkedList_separateEvenOddNodes.head = linkedList_separateEvenOddNodes.add(linkedList_separateEvenOddNodes.head, 30);
        linkedList_separateEvenOddNodes.head = linkedList_separateEvenOddNodes.add(linkedList_separateEvenOddNodes.head, 43);


        System.out.println("displaying the linked list : ");

        linkedList_separateEvenOddNodes.display(linkedList_separateEvenOddNodes.head);

        System.out.println();

        ListNode listNode = linkedList_separateEvenOddNodes.separateEvenOddNodes(linkedList_separateEvenOddNodes.head);

        System.out.println();

        System.out.println("displaying list with separated even odd nodes ");

        linkedList_separateEvenOddNodes.display(listNode);
    }
}
