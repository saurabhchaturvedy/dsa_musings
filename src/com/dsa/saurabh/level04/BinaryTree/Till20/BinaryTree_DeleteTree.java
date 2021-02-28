package com.dsa.saurabh.level04.BinaryTree.Till20;

public class BinaryTree_DeleteTree {

    TreeNode root;
    int maxLevel = 0;


    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    private TreeNode deleteTree(TreeNode node) {
        if (node == null) return null;

        node.left = deleteTree(node.left);
        node.right = deleteTree(node.right);

        System.out.println("Deleting node with data : " + node.data);
        node = null;
        return node;
    }

    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree_DeleteTree binaryTree_deleteTree = new BinaryTree_DeleteTree();
        binaryTree_deleteTree.root = new TreeNode(10);
        binaryTree_deleteTree.root.left = new TreeNode(20);
        binaryTree_deleteTree.root.right = new TreeNode(30);

        binaryTree_deleteTree.inorder(binaryTree_deleteTree.root);

        System.out.println();

        binaryTree_deleteTree.root = binaryTree_deleteTree.deleteTree(binaryTree_deleteTree.root);

        System.out.println();
        System.out.println("Printing tree after deletion...");

        binaryTree_deleteTree.inorder(binaryTree_deleteTree.root);
    }
}
