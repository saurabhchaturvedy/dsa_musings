package com.dsa.saurabh.level01.LinkedListSum;

public class LinkedList {

    private Node head;

    private static class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private static Node linkedListSum(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node temp = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if (l1 != null) {
                sum = sum + l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum = sum + l2.data;
                l2 = l2.next;
            }

            sum = sum + carry;
            carry = sum / 10;
            Node newNode = new Node(sum % 10);
            temp.next = newNode;
            temp = temp.next;
        }
        return dummy.next;
    }

    private static void display(Node node) {
        Node current = node;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.head = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);

        linkedList1.head.next = second;
        second.next = third;

        LinkedList linkedList2 = new LinkedList();
        linkedList2.head = new Node(2);
        Node second_2 = new Node(3);
        Node third_2 = new Node(4);

        linkedList2.head.next = second_2;
        second_2.next = third_2;


        Node node = linkedListSum(linkedList1.head, linkedList2.head);
        display(node);


    }
}
