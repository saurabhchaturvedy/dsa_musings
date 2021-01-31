package com.dsa.saurabh.level01.Tries;

import java.util.List;

public class App {

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("ram");
        trie.insert("ramjas");
        trie.insert("bhramdev");
        trie.insert("cram");
        trie.insert("apple");

        List<String> ram = trie.getSuggestions("");
        ram.stream().map(x -> x + " ").forEach(System.out::print);

    }
}
