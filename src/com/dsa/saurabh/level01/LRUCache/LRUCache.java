
package com.dsa.saurabh.level01.LRUCache;


import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private int actualSize;
    private Map<Integer, Node> map;
    private DoublyLinkedList doublyLinkedList;

    LRUCache() {
        this.map = new HashMap<>();
        this.doublyLinkedList = new DoublyLinkedList();
    }

    public void put(int id, String data) {
        if (this.map.containsKey(id)) {
            Node node = this.map.get(id);
            node.setData(data);
            update(node);
            return;
        }

        Node newNode = new Node(id, data);

        if (this.actualSize < Constants.CAPACITY) {
            this.actualSize++;
            add(newNode);
        } else {
            removeTail();
            add(newNode);
        }
    }

    public Node get(int id) {
        if (!this.map.containsKey(id)) return null;
        Node node = this.map.get(id);
        update(node);
        return node;
    }

    private void removeTail() {

        Node tailNode = this.map.get(this.doublyLinkedList.getTailNode().getId());

        this.doublyLinkedList.setTailNode(this.doublyLinkedList.getTailNode().getPreviousNode());
        if (this.doublyLinkedList.getTailNode() == null) {
            this.doublyLinkedList.getTailNode().setNextNode(null);
        }
        tailNode = null;
    }

    private void add(Node newNode) {

        newNode.setNextNode(this.doublyLinkedList.getHeadNode());
        newNode.setPreviousNode(null);
        if (newNode.getNextNode() != null) {
            newNode.getNextNode().setPreviousNode(newNode);
        }
        this.doublyLinkedList.setHeadNode(newNode);

        if (this.doublyLinkedList.getTailNode() == null) {
            this.doublyLinkedList.setTailNode(newNode);
        }

        this.map.put(newNode.getId(), newNode);
    }

    private void update(Node node) {
        Node previousNode = node.getPreviousNode();
        Node nextNode = node.getNextNode();

        if (previousNode != null)
            previousNode.setNextNode(nextNode);
        else
            this.doublyLinkedList.setHeadNode(nextNode);

        if (nextNode != null)
            nextNode.setPreviousNode(previousNode);
        else
            this.doublyLinkedList.setTailNode(previousNode);

        add(node);

    }

    public void show() {
        Node headNode = this.doublyLinkedList.getHeadNode();
        while (headNode != null) {
            System.out.print(headNode + "<->");
            headNode = headNode.getNextNode();
        }

    }


}
