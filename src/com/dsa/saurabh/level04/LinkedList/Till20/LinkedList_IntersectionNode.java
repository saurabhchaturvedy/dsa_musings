package com.dsa.saurabh.level04.LinkedList.Till20;

class Node3 {
    Node3 next;
    int data;
}

class Linked2 {
    /*
     * It'll get lowest common element of two linked list
     */
    public Node3 getLowestCommomElementOfTwoLinkedLists(Node3 a, Node3 b) {
        a = mergeSort(a);
        b = mergeSort(b);
        Node3 temp;
        while (a != null && b != null) {
            if (a.data < b.data) {
                a = a.next;
            } else if (a.data > b.data) {
                b = b.next;
            } else {
                temp = a;
                temp.next = null;
                return temp;
            }
        }
        return null;
    }

    /*
     * It'll sort the linked list
     */
    public Node3 mergeSort(Node3 node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node3 middle = middleNode(node);
        Node3 secondHalf = middle.next;
        middle.next = null;

        return merge(mergeSort(node), mergeSort(secondHalf));
    }

    /*
     * It'll return the middle node of linked list
     */
    public Node3 middleNode(Node3 node) {
        if (node == null) {
            return null;
        }

        Node3 a = node;
        Node3 b = node.next;

        while (b != null && b.next != null) {
            a = a.next;
            b = b.next.next;
        }

        return a;
    }

    /*
     * It'll merge two linked list
     */
    public Node3 merge(Node3 a, Node3 b) {
        Node3 temp = new Node3();
        Node3 finalList = temp;

        while (a != null && b != null) {
            if (a.data < b.data) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }
        temp.next = (a == null) ? b : a;
        return finalList.next;
    }

    /*
     * getNewNode() method to generate a new node
     */
    public Node3 getNewNode(int key) {
        Node3 a = new Node3();
        a.next = null;
        a.data = key;
        return a;
    }

    /*
     * insert method is used to insert the element in Linked List
     */
    public Node3 insert(int key, Node3 node) {

        if (node == null)
            return getNewNode(key);
        else
            node.next = insert(key, node.next);

        return node;
    }

    /*
     * It'll print the complete linked list
     */
    public void printList(Node3 node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        printList(node.next);
    }
}

public class LinkedList_IntersectionNode {

    public static void main(String[] args) {

        Node3 head1 = null;
        Linked2 a = new Linked2();

        head1 = a.insert(37, head1);
        head1 = a.insert(8, head1);
        head1 = a.insert(13, head1);
        head1 = a.insert(18, head1);

        Node3 head2 = null;
        head2 = a.insert(18, head2);
        head2 = a.insert(14, head2);
        head2 = a.insert(8, head2);

        a.printList(head1);
        System.out.println();

        a.printList(head2);
        System.out.println();

        Node3 lce = a.getLowestCommomElementOfTwoLinkedLists(head1, head2);
        if (lce != null) {
            System.out.println(lce.data);
        } else {
            System.out.println("No Common element exists between two linked lists");
        }

    }
}