package com.dsa.saurabh.level01.Tree_CS;

public class BinaryTree_RightView {

    TreeNode root;
    static int maxLevel;

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

    private void printRightView(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (level >= maxLevel) {
            System.out.print(node.data + " ");
            maxLevel++;
        }

        printRightView(node.right, level + 1);
        printRightView(node.left, level + 1);
    }

    public static void main(String[] args) {

        BinaryTree_RightView binaryTree_rightView = new BinaryTree_RightView();
        binaryTree_rightView.root = new BinaryTree_RightView.TreeNode(2);
        binaryTree_rightView.root.left = new BinaryTree_RightView.TreeNode(7);
        binaryTree_rightView.root.left.right = new BinaryTree_RightView.TreeNode(6);
        binaryTree_rightView.root.left.right.right = new BinaryTree_RightView.TreeNode(11);
        binaryTree_rightView.root.left.right.left = new BinaryTree_RightView.TreeNode(5);
        binaryTree_rightView.root.left.left = new BinaryTree_RightView.TreeNode(2);
        binaryTree_rightView.root.right = new BinaryTree_RightView.TreeNode(5);
        binaryTree_rightView.root.right.right = new BinaryTree_RightView.TreeNode(9);
        binaryTree_rightView.root.right.right.left = new BinaryTree_RightView.TreeNode(4);
        binaryTree_rightView.printRightView(binaryTree_rightView.root, 0);
    }
}
