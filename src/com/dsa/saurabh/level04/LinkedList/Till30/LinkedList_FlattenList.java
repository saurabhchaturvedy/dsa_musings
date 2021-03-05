package com.dsa.saurabh.level04.LinkedList.Till30;

public class LinkedList_FlattenList {


    ListNode head;


    private class ListNode {
        int data;
        ListNode next;
        ListNode right;


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
        listNode.right = null;
        return listNode;
    }

    private ListNode flatten(ListNode node) {
        if (node == null || node.right == null)
            return node;
        return merge(node, flatten(node.right));
    }

    private ListNode merge(ListNode first, ListNode second) {

        ListNode temp = new ListNode(0);
        ListNode finalList = temp;

        while (first != null && second != null) {
            if (first.data < second.data) {
                temp.next = first;
                first = first.next;
            } else {
                temp.next = second;
                second = second.next;
            }

            temp = temp.next;
        }

        temp.next = (first != null) ? first : second;
        finalList.next.right = null;
        return finalList.next;
    }

    private void display(ListNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        display(node.next);
    }


    public static void main(String[] args) {
        LinkedList_FlattenList linkedList_flattenList = new LinkedList_FlattenList();

        linkedList_flattenList.head = linkedList_flattenList.add(linkedList_flattenList.head, 20);
        linkedList_flattenList.head = linkedList_flattenList.add(linkedList_flattenList.head, 22);
        linkedList_flattenList.head = linkedList_flattenList.add(linkedList_flattenList.head, 25);
        linkedList_flattenList.head = linkedList_flattenList.add(linkedList_flattenList.head, 65);
        linkedList_flattenList.head = linkedList_flattenList.add(linkedList_flattenList.head, 70);


        linkedList_flattenList.head.right = linkedList_flattenList.add(linkedList_flattenList.head.right, 7);
        linkedList_flattenList.head.right = linkedList_flattenList.add(linkedList_flattenList.head.right, 12);
        linkedList_flattenList.head.right = linkedList_flattenList.add(linkedList_flattenList.head.right, 23);
        linkedList_flattenList.head.right = linkedList_flattenList.add(linkedList_flattenList.head.right, 34);

        linkedList_flattenList.head.right.right = linkedList_flattenList.add(linkedList_flattenList.head.right.right, 10);
        linkedList_flattenList.head.right.right = linkedList_flattenList.add(linkedList_flattenList.head.right.right, 15);
        linkedList_flattenList.head.right.right = linkedList_flattenList.add(linkedList_flattenList.head.right.right, 17);
        linkedList_flattenList.head.right.right = linkedList_flattenList.add(linkedList_flattenList.head.right.right, 18);
        linkedList_flattenList.head.right.right = linkedList_flattenList.add(linkedList_flattenList.head.right.right, 21);
        linkedList_flattenList.head.right.right = linkedList_flattenList.add(linkedList_flattenList.head.right.right, 33);

        linkedList_flattenList.head.right.right.right = linkedList_flattenList.add(linkedList_flattenList.head.right.right.right, 32);
        linkedList_flattenList.head.right.right.right = linkedList_flattenList.add(linkedList_flattenList.head.right.right.right, 39);
        linkedList_flattenList.head.right.right.right = linkedList_flattenList.add(linkedList_flattenList.head.right.right.right, 40);

        ListNode flatten = linkedList_flattenList.flatten(linkedList_flattenList.head);

        linkedList_flattenList.display(flatten);

    }
}
