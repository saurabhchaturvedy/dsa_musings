package com.dsa.saurabh.level04.BinaryTree.Till10;

public class BinaryTree_Height {


    TreeNode root;


    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    private int height(TreeNode node) {
        if (node == null) return -1;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        BinaryTree_Height binaryTree_height = new BinaryTree_Height();
        binaryTree_height.root = new TreeNode(10);
        binaryTree_height.root.left = new TreeNode(20);
        binaryTree_height.root.right = new TreeNode(30);

        System.out.println(binaryTree_height.height(binaryTree_height.root));
    }
}
