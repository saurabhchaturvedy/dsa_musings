package com.dsa.saurabh.level01.Tries;

public class Node {

    private String character;
    private Node[] children;
    private boolean leaf;
    private boolean visited;

    Node(String character) {
        this.character = character;
        this.children = new Node[Constant.ALPHABET_SIZE];
    }

    private void setChild(int index, Node node) {
        this.children[index] = node;
    }

    @Override
    public String toString() {
        return this.character;
    }
}
