package com.dsa.saurabh.level01.Tries;

public class Trie {

    Node root;

    Trie() {
        this.root = new Node("");
    }

    public void insert(String word) {

        Node tempNode = root;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (tempNode.getChild(index) == null) {
                Node node = new Node(String.valueOf(c));
                tempNode.setChild(index, node);
                tempNode = node;
            } else {
                tempNode = tempNode.getChild(index);
            }
        }

        tempNode.setLeaf(true);

    }

    public void search(String word) {

    }
}
