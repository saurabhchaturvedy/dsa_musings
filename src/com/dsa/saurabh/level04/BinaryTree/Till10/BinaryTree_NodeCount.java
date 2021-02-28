package com.dsa.saurabh.level04.BinaryTree.Till10;

public class BinaryTree_NodeCount {

    TreeNode root;


    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private int nodeCount(TreeNode node) {
        if (node == null) return 0;
        return 1 + nodeCount(node.left) + nodeCount(node.right);
    }


    public static void main(String[] args) {
        BinaryTree_NodeCount binaryTree_nodeCount = new BinaryTree_NodeCount();
        binaryTree_nodeCount.root = new TreeNode(10);
        binaryTree_nodeCount.root.left = new TreeNode(20);
        binaryTree_nodeCount.root.right = new TreeNode(30);

        System.out.println(binaryTree_nodeCount.nodeCount(binaryTree_nodeCount.root));
    }
}
