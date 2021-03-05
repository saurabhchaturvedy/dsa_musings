package com.dsa.saurabh.level04.LinkedList.Till30;

public class LinkedList_DeleteNNodesAfterMNodes {


    ListNode head;

    private class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }


    private ListNode deleteNNodesAfterMNodes(ListNode node, int M, int N) {
        if (node == null) {
            return null;
        }

        ListNode temp1 = node;
        ListNode temp2 = null;

        int i = 0;
        int j = 0;

        while (i++ < M - 1) {
            temp1 = temp1.next;
        }

        temp2 = (M == 0) ? temp1 : temp1.next;

        while (j++ < N) {
            if (temp2 == null) {
                System.out.println("There are no nodes to delete");
                return node;
            }

            temp2 = temp2.next;
        }

        if (M == 0) {
            return temp2;
        } else {
            temp1.next = temp2;
        }

        return node;

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


    public static void main(String[] args) {
        LinkedList_DeleteNNodesAfterMNodes linkedList_deleteNNodesAfterMNodes = new LinkedList_DeleteNNodesAfterMNodes();
        linkedList_deleteNNodesAfterMNodes.head = linkedList_deleteNNodesAfterMNodes.add(linkedList_deleteNNodesAfterMNodes.head, 10);
        linkedList_deleteNNodesAfterMNodes.head = linkedList_deleteNNodesAfterMNodes.add(linkedList_deleteNNodesAfterMNodes.head, 20);
        linkedList_deleteNNodesAfterMNodes.head = linkedList_deleteNNodesAfterMNodes.add(linkedList_deleteNNodesAfterMNodes.head, 30);
        linkedList_deleteNNodesAfterMNodes.head = linkedList_deleteNNodesAfterMNodes.add(linkedList_deleteNNodesAfterMNodes.head, 40);
        linkedList_deleteNNodesAfterMNodes.head = linkedList_deleteNNodesAfterMNodes.add(linkedList_deleteNNodesAfterMNodes.head, 50);
        linkedList_deleteNNodesAfterMNodes.head = linkedList_deleteNNodesAfterMNodes.add(linkedList_deleteNNodesAfterMNodes.head, 60);


        linkedList_deleteNNodesAfterMNodes.display(linkedList_deleteNNodesAfterMNodes.head);

        linkedList_deleteNNodesAfterMNodes.head = linkedList_deleteNNodesAfterMNodes.deleteNNodesAfterMNodes(linkedList_deleteNNodesAfterMNodes.head, 3, 2);

        System.out.println();

        linkedList_deleteNNodesAfterMNodes.display(linkedList_deleteNNodesAfterMNodes.head);
    }
}
