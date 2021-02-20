package com.dsa.saurabh.level02.Tree_holczer_balazs.BinarySearchTrees;

public class App {

    public static void main(String[] args) {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(10);
        binarySearchTree.insert(5);
        binarySearchTree.insert(15);
        binarySearchTree.insert(3);
        binarySearchTree.insert(9);
        binarySearchTree.insert(20);


        System.out.println("Maximum node value : " + binarySearchTree.max());
        System.out.println("Minimum node value : " + binarySearchTree.min());
        binarySearchTree.traversal();
        binarySearchTree.delete(10);
        System.out.println();
        binarySearchTree.traversal();
    }
}
