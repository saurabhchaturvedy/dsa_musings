package com.dsa.saurabh.level01.Tree_CS;

public class BinaryTree_NoOfLeafNodes {

    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    private int leafNodeCount(TreeNode node) {
        if (node == null) return 0;

        if (node.left == null && node.right == null) return 1;

        return leafNodeCount(node.left) + leafNodeCount(node.right);
    }


    public static void main(String[] args) {

        BinaryTree_NoOfLeafNodes binaryTree_noOfLeafNodes = new BinaryTree_NoOfLeafNodes();
        binaryTree_noOfLeafNodes.root = new TreeNode(10);
        binaryTree_noOfLeafNodes.root.left = new TreeNode(20);
        binaryTree_noOfLeafNodes.root.right = new TreeNode(30);

        System.out.println(binaryTree_noOfLeafNodes.leafNodeCount(binaryTree_noOfLeafNodes.root));

    }
}
