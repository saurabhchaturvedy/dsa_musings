package com.dsa.saurabh.level01.Tries;

public class Node {

    private String character;
    private Node[] children;
    private boolean isEndOfWord;

    Node(String character) {
        this.character = character;
        this.children = new Node[Constant.ALPHABET_SIZE];
    }

    public void setChild(int index, Node node) {
        this.children[index] = node;
    }

    public Node getChild(int index) {
        return this.children[index];
    }

    public String getCharacter() {
        return character;
    }

    public Node[] getChildren() {
        return children;
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        this.isEndOfWord = endOfWord;
    }

    @Override
    public String toString() {
        return this.character;
    }
}
