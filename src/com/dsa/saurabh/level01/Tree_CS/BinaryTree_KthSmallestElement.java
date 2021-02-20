package com.dsa.saurabh.level01.Tree_CS;

public class BinaryTree_KthSmallestElement {

    private TreeNode root;
    static int count = 0;
    int val = 0;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private void kthSmallestElement(TreeNode node, int k) {
        if (node == null) return;

        if (node.left != null) {
            kthSmallestElement(node.left, k);

        }

        if (node.right != null) {
            kthSmallestElement(node.right, k);
        }
        count++;

        if (count == k) {
            val = node.data;
            return;
        }


    }

    private int KthSmallesElement(TreeNode node, int k) {
        kthSmallestElement(node, k);
        return val;
    }


    public static void main(String[] args) {

        BinaryTree_KthSmallestElement binaryTree_kthSmallestElement = new BinaryTree_KthSmallestElement();
        binaryTree_kthSmallestElement.root = new TreeNode(10);
        TreeNode second = new TreeNode(20);
        TreeNode third = new TreeNode(30);
        binaryTree_kthSmallestElement.root.left = second;
        binaryTree_kthSmallestElement.root.right = third;

        System.out.println(binaryTree_kthSmallestElement.KthSmallesElement(binaryTree_kthSmallestElement.root, 2));

    }
}
