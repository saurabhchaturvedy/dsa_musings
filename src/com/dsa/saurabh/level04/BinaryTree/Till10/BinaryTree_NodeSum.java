package com.dsa.saurabh.level04.BinaryTree.Till10;

public class BinaryTree_NodeSum {

    TreeNode root;


    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private int nodeSum(TreeNode node) {
        if (node == null) return 0;
        return node.data + nodeSum(node.left) + nodeSum(node.right);
    }

    public static void main(String[] args) {
        BinaryTree_NodeSum binaryTree_nodeSum = new BinaryTree_NodeSum();
        binaryTree_nodeSum.root = new TreeNode(10);
        binaryTree_nodeSum.root.left = new TreeNode(20);
        binaryTree_nodeSum.root.right = new TreeNode(30);

        System.out.println(binaryTree_nodeSum.nodeSum(binaryTree_nodeSum.root));
    }
}
