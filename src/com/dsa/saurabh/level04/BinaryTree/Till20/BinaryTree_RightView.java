package com.dsa.saurabh.level04.BinaryTree.Till20;

public class BinaryTree_RightView {

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

    private void rightView(TreeNode node, int level) {
        if (node == null) return;

        if (level >= maxLevel) {
            System.out.print(node.data + " ");
            maxLevel++;
        }

        rightView(node.right, level + 1);
        rightView(node.left, level + 1);

    }


    public static void main(String[] args) {
        BinaryTree_RightView binaryTree_leftView = new BinaryTree_RightView();
        binaryTree_leftView.root = new TreeNode(10);
        binaryTree_leftView.root.left = new TreeNode(20);
        binaryTree_leftView.root.left.left = new TreeNode(40);
        binaryTree_leftView.root.left.right = new TreeNode(50);
        binaryTree_leftView.root.right = new TreeNode(30);

        binaryTree_leftView.rightView(binaryTree_leftView.root, 0);
    }
}
