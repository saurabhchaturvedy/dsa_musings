package com.dsa.saurabh.level04.BinaryTree.Till10;

public class BinaryTree_Creation {


    TreeNode root;


    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private void display(TreeNode node) {
        if (node == null) return;
        display(node.left);
        System.out.print(node.data + " ");
        display(node.right);

    }


    public static void main(String[] args) {
        BinaryTree_Creation binaryTree_creation = new BinaryTree_Creation();
        binaryTree_creation.root = new TreeNode(10);
        binaryTree_creation.root.left = new TreeNode(20);
        binaryTree_creation.root.right = new TreeNode(30);

        binaryTree_creation.display(binaryTree_creation.root);
    }
}
