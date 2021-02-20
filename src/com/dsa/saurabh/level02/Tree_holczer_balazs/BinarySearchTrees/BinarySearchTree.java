package com.dsa.saurabh.level02.Tree_holczer_balazs.BinarySearchTrees;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    Node<T> root;

    @Override
    public void insert(T data) {

        if (root == null) {
            root = new Node<>(data, null);
        } else {
            insert(data, root);
        }

    }

    private void insert(T data, Node<T> node) {
        if (node.getData().compareTo(data) > 0) {
            if (node.getLeft() != null) {
                insert(data, node.getLeft());
            } else {
                node.setLeft(new Node<>(data, node));
            }
        } else {
            if (node.getRight() != null) {
                insert(data, node.getRight());
            } else {
                node.setRight(new Node<>(data, node));
            }
        }
    }

    @Override
    public void delete(T data) {
        if (root == null) return;
        else {
            delete(data, root);
        }
    }

    private void delete(T data, Node<T> node) {
        if (node == null) return;

        if (data.compareTo(node.getData()) < 0) {
            delete(data, node.getLeft());
        } else if (data.compareTo(node.getData()) > 0) {
            delete(data, node.getRight());
        } else {
            if (node.getLeft() == null && node.getRight() == null) {
                System.out.println("Removing a leaf node...");
                Node<T> parent = node.getParent();

                if (parent != null && parent.getLeft() == node) {
                    parent.setLeft(null);
                } else if (parent != null && parent.getRight() == node) {
                    parent.setRight(null);
                }

                if (parent == null) {
                    root = null;
                }

                node = null;
            } else if (node.getRight() != null && node.getLeft() == null) {
                System.out.println("Removing a node with only a right child...");
                Node<T> parent = node.getParent();

                if (parent != null && parent.getRight() == node) {
                    parent.setRight(node.getRight());
                } else {
                    if (parent != null && parent.getLeft() == node) {
                        parent.setLeft(node.getRight());
                    }
                }

                if (parent == null) {
                    parent = node.getRight();
                }
                node.getRight().setParent(parent);
                node = null;
            } else if (node.getLeft() != null && node.getRight() == null) {
                System.out.println("Removing a node with only a left child...");
                Node<T> parent = node.getParent();

                if (parent != null && parent.getRight() == node) {
                    parent.setRight(node.getLeft());
                } else {
                    if (parent != null && parent.getLeft() == node) {
                        parent.setLeft(node.getLeft());
                    }
                    if (parent == null) {
                        parent = node.getLeft();
                    }
                    node.getLeft().setParent(parent);
                    node = null;
                }
            } else {
                // node has 2 children
                System.out.println("Removing a node with 2 children...");
                Node<T> predecessor = getPredecessor(node.getLeft());
                T temp = predecessor.getData();
                predecessor.setData(node.getData());
                node.setData(temp);

                delete(data, predecessor);
            }
        }

    }

    private Node<T> getPredecessor(Node<T> node) {

        if (node.getRight() != null)
            return getPredecessor(node.getRight());
        return node;
    }

    @Override
    public void traversal() {
        if (root == null) return;
        traversal(root);
    }

    @Override
    public T min() {
        if (root == null)
            return null;
        return min(root);
    }

    @Override
    public T max() {
        if (root == null)
            return null;
        return max(root);
    }

    private T max(Node<T> node) {
        if (node.getRight() != null)
            return max(node.getRight());
        return node.getData();
    }

    private T min(Node<T> node) {
        if (node.getLeft() != null)
            return min(node.getLeft());
        return node.getData();
    }

    private void traversal(Node<T> node) {
        if (node.getLeft() != null)
            traversal(node.getLeft());

        System.out.print(node.getData() + " - ");

        if (node.getRight() != null)
            traversal(node.getRight());

    }

}
