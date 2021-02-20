package com.dsa.saurabh.level02.Tree_holczer_balazs.BinarySearchTrees;

public class App {

    public static void main(String[] args) {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(12);
        binarySearchTree.insert(4);
        binarySearchTree.insert(20);
        binarySearchTree.insert(1);
        binarySearchTree.insert(8);
        binarySearchTree.insert(16);
        binarySearchTree.insert(27);


        binarySearchTree.traversal();

        System.out.println();

        binarySearchTree.delete(16);

        binarySearchTree.delete(20);

        binarySearchTree.delete(4);

        System.out.println();

        binarySearchTree.traversal();

        BinarySearchTree<Person> personBinarySearchTree = new BinarySearchTree<>();
        Person saurabh = new Person(19, "Deepak");
        Person shailesh = new Person(31, "Shailesh");
        Person ravindra = new Person(28, "Ravindra");
        Person sheetal = new Person(22, "Sheetal");
        Person amit = new Person(41, "Amit");
        Person anjali = new Person(13, "Anjali");
        personBinarySearchTree.insert(saurabh);
        personBinarySearchTree.insert(shailesh);
        personBinarySearchTree.insert(ravindra);
        personBinarySearchTree.insert(sheetal);
        personBinarySearchTree.insert(amit);
        personBinarySearchTree.insert(anjali);


        personBinarySearchTree.traversal();

        personBinarySearchTree.delete(ravindra);

        personBinarySearchTree.traversal();

    }
}
