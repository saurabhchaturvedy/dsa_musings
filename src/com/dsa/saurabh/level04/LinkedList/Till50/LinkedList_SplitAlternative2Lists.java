package com.dsa.saurabh.level04.LinkedList.Till50;

public class LinkedList_SplitAlternative2Lists {

    private ListNode head;
    private ListNode firstHead;
    private ListNode secondHead;

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

    private void splitListAlternatively(ListNode node) {
        if (node == null)
            return;

        ListNode firstTemp;
        ListNode secondTemp;

        firstHead = firstTemp = node;
        secondHead = secondTemp = node.next;

        node = node.next.next;

        while (node != null && node.next != null) {
            firstTemp.next = node;
            secondTemp.next = node.next;

            firstTemp = firstTemp.next;
            secondTemp = secondTemp.next;

            node = node.next.next;
        }

        if (node != null) {
            firstTemp = node;
            firstTemp = firstTemp.next;
        }

        firstTemp.next = null;
        secondTemp.next = null;

    }

    private void display(ListNode node)
    {
        if(node==null)
            return;
        System.out.print(node.data+" ");
        display(node.next);
    }

    public static void main(String[] args) {
      LinkedList_SplitAlternative2Lists linkedList_splitAlternative2Lists = new LinkedList_SplitAlternative2Lists();
        linkedList_splitAlternative2Lists.head = linkedList_splitAlternative2Lists.add(linkedList_splitAlternative2Lists.head,10);
        linkedList_splitAlternative2Lists.head = linkedList_splitAlternative2Lists.add(linkedList_splitAlternative2Lists.head,20);
        linkedList_splitAlternative2Lists.head = linkedList_splitAlternative2Lists.add(linkedList_splitAlternative2Lists.head,30);
        linkedList_splitAlternative2Lists.head = linkedList_splitAlternative2Lists.add(linkedList_splitAlternative2Lists.head,40);
        linkedList_splitAlternative2Lists.head = linkedList_splitAlternative2Lists.add(linkedList_splitAlternative2Lists.head,50);
        linkedList_splitAlternative2Lists.head = linkedList_splitAlternative2Lists.add(linkedList_splitAlternative2Lists.head,60);

        System.out.println("displaying the list :: ");

        linkedList_splitAlternative2Lists.display(linkedList_splitAlternative2Lists.head);

        System.out.println();

        System.out.println("splitting alternatively into two lists : ");

        linkedList_splitAlternative2Lists.splitListAlternatively(linkedList_splitAlternative2Lists.head);

        System.out.println("List 1 ::: ");

        linkedList_splitAlternative2Lists.display(linkedList_splitAlternative2Lists.firstHead);

        System.out.println();

        System.out.println("List 2 ::: ");

        linkedList_splitAlternative2Lists.display(linkedList_splitAlternative2Lists.secondHead);
    }
}
