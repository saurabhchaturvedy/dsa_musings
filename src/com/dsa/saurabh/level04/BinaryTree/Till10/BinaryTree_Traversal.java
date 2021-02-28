package com.dsa.saurabh.level04.BinaryTree.Till10;

public class BinaryTree_Traversal {


    TreeNode root;


    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private void preOrderTraversal(TreeNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    private void postOrderTraversal(TreeNode node) {
        if (node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    private void inOrderTraversal(TreeNode node) {
        if (node == null) return;
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }


    public static void main(String[] args) {
        BinaryTree_Traversal binaryTree_creation = new BinaryTree_Traversal();
        binaryTree_creation.root = new TreeNode(10);
        binaryTree_creation.root.left = new TreeNode(20);
        binaryTree_creation.root.right = new TreeNode(30);

        binaryTree_creation.preOrderTraversal(binaryTree_creation.root);

        System.out.println();

        binaryTree_creation.postOrderTraversal(binaryTree_creation.root);

        System.out.println();

        binaryTree_creation.inOrderTraversal(binaryTree_creation.root);

        System.out.println();
    }
}
