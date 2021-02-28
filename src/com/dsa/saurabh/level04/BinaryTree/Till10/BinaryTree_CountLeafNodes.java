package com.dsa.saurabh.level04.BinaryTree.Till10;

public class BinaryTree_CountLeafNodes {


    TreeNode root;


    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    private int countLeafNodes(TreeNode node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

    public static void main(String[] args) {
        BinaryTree_CountLeafNodes binaryTree_countLeafNodes = new BinaryTree_CountLeafNodes();
        binaryTree_countLeafNodes.root = new TreeNode(10);
        binaryTree_countLeafNodes.root.left = new TreeNode(20);
        binaryTree_countLeafNodes.root.right = new TreeNode(30);

        System.out.println(binaryTree_countLeafNodes.countLeafNodes(binaryTree_countLeafNodes.root));


    }
}
