package com.dsa.saurabh.level04.BinaryTree.Till10;

public class BinaryTree_LevelOrderRecursion {


    TreeNode root;


    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private void levelOrderRecursion(TreeNode node) {
        if (node == null) return;

        int height = height(node);
        for (int i = 0; i <= height; i++) {
            printNodesAtLevelK(node, i + 1);
            System.out.println();
        }
    }

    private int height(TreeNode node) {

        if (node == null) return -1;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    private void printNodesAtLevelK(TreeNode node, int k) {
        if (node == null) return;

        if (k == 1) {
            System.out.print(node.data + " ");
            return;
        }

        printNodesAtLevelK(node.left, k - 1);
        printNodesAtLevelK(node.right, k - 1);
    }

    public static void main(String[] args) {
        BinaryTree_LevelOrderRecursion binaryTree_levelOrderRecursion = new BinaryTree_LevelOrderRecursion();
        binaryTree_levelOrderRecursion.root = new TreeNode(10);
        binaryTree_levelOrderRecursion.root.left = new TreeNode(20);
        binaryTree_levelOrderRecursion.root.right = new TreeNode(30);

        binaryTree_levelOrderRecursion.levelOrderRecursion(binaryTree_levelOrderRecursion.root);
    }
}
