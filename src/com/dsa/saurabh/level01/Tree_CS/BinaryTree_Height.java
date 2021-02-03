package com.dsa.saurabh.level01.Tree_CS;

public class BinaryTree_Height {


    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private static int height(TreeNode node) {
        if (node == null)
            return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        BinaryTree_Height binaryTree_height = new BinaryTree_Height();
        binaryTree_height.root = new BinaryTree_Height.TreeNode(2);
        binaryTree_height.root.left = new BinaryTree_Height.TreeNode(7);
//        binaryTree_height.root.left.right = new BinaryTree_Height.TreeNode(6);
//        binaryTree_height.root.left.right.right = new BinaryTree_Height.TreeNode(11);
//        binaryTree_height.root.left.right.left = new BinaryTree_Height.TreeNode(5);
//        binaryTree_height.root.left.left = new BinaryTree_Height.TreeNode(2);
        binaryTree_height.root.right = new BinaryTree_Height.TreeNode(5);
//        binaryTree_height.root.right.right = new BinaryTree_Height.TreeNode(9);
//        binaryTree_height.root.right.right.left = new BinaryTree_Height.TreeNode(4);
        int height = height(binaryTree_height.root);
        System.out.println("Height of binary tree is : " + height);
    }
}
