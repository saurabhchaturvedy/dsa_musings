package com.dsa.saurabh.level02.Tree_holczer_balazs.BinarySearchTrees;

public interface Tree<T> {

    void insert(T data);
    void delete(T data);
    void traversal();
    T min();
    T max();
}
