package com.dsa.saurabh.level02.Tree_holczer_balazs.AVLTrees;


public class AVLTree<T extends Comparable<T>> implements Tree<T> {


    Node<T> root;


    @Override
    public void insert(T data) {

        if (root == null) {
            root = new Node<T>(data, null);
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
                node.setRight(new Node<T>(data, node));
            }
        }
        updateHeight(node);
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
                updateHeight(parent);
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
                updateHeight(parent);
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
                    updateHeight(parent);
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

    @Override
    public void traverse() {
        if (root == null) return;
        traversal(root);
    }

    private Node<T> getPredecessor(Node<T> node) {
        if (node.getRight() != null)
            return getPredecessor(node.getRight());
        return node;
    }

    private void traversal(Node<T> node) {
        if (node.getLeft() != null)
            traversal(node.getLeft());

        System.out.print(node.getData() + " - ");

        if (node.getRight() != null)
            traversal(node.getRight());

    }


    private int getHeight(Node<T> node) {
        if (node == null) return -1;
        return node.getHeight();
    }

    private void updateHeight(Node<T> node) {
        node.setHeight(Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1);
    }

    private int getBalanceFactor(Node<T> node) {
        if (node == null) return 0;
        return getBalanceFactor(node.getLeft()) - getBalanceFactor(node.getRight());
    }

}

