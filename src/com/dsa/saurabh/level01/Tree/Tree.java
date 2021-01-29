package com.dsa.saurabh.level01.Tree;

public interface Tree<T> {

    public void insert(Node<T> node);

    public void remove(Node<T> node);

    public void traversal();

    public T getMin();


    public T getMax();

}
