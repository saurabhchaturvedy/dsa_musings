package com.dsa.saurabh.level01.Tries;

import java.util.ArrayList;
import java.util.List;

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

        tempNode.setEndOfWord(true);

    }

    public boolean search(String word) {
        Node trieNode = root;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (trieNode.getChild(index) == null) {
                return false;
            } else {
                trieNode = trieNode.getChild(index);
            }
        }
        return trieNode.isEndOfWord();
    }

    public List<String> getSuggestions(String prefix) {
        Node trieNode = root;
        List<String> suggestionList = new ArrayList<>();
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            int index = c - 'a';
            trieNode = trieNode.getChild(index);
        }
        collect(trieNode, prefix, suggestionList);

        return suggestionList;
    }

    private void collect(Node node, String prefix, List<String> suggestionList) {

        if (node == null) return;

        if (node.isEndOfWord()) {
            suggestionList.add(prefix);
        }

        for (Node node1 : node.getChildren()) {
            if (node1 == null) continue;
            String character = node1.getCharacter();
            collect(node1, prefix + character, suggestionList);
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("cat");
        trie.insert("dog");
        trie.insert("bat");
        trie.insert("pot");
        trie.insert("cataract");

        System.out.println(trie.search("ba"));
    }
}
