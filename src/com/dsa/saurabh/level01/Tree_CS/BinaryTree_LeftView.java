package com.dsa.saurabh.level01.Tree_CS;

public class BinaryTree_LeftView {

    TreeNode root;
    static int maxLevel = 0;

    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private void printLeftView(TreeNode node, int level) {

        if (node == null) {
            return;
        }
        if (level >= maxLevel) {
            System.out.print(node.data + " ");
            maxLevel++;
        }

        printLeftView(node.left, level + 1);
        printLeftView(node.right, level + 1);
    }


    public static void main(String[] args) {

        BinaryTree_LeftView binaryTree_leftView = new BinaryTree_LeftView();
        binaryTree_leftView.root = new TreeNode(2);
        binaryTree_leftView.root.left = new TreeNode(7);
        binaryTree_leftView.root.left.right = new TreeNode(6);
        binaryTree_leftView.root.left.right.right = new TreeNode(11);
        binaryTree_leftView.root.left.right.left = new TreeNode(5);
        binaryTree_leftView.root.left.left = new TreeNode(2);
        binaryTree_leftView.root.right = new TreeNode(5);
        binaryTree_leftView.root.right.right = new TreeNode(9);
        binaryTree_leftView.root.right.right.left = new TreeNode(4);
        binaryTree_leftView.printLeftView(binaryTree_leftView.root, 0);
    }
}
