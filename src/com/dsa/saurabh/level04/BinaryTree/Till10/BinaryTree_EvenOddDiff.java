package com.dsa.saurabh.level04.BinaryTree.Till10;

public class BinaryTree_EvenOddDiff {


    TreeNode root;


    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private int evenOddDifference(TreeNode node) {
        if (node == null) return 0;
        return node.data - evenOddDifference(node.left) - evenOddDifference(node.right);
    }


    public static void main(String[] args) {
        BinaryTree_EvenOddDiff binaryTree_evenOddDiff = new BinaryTree_EvenOddDiff();
        binaryTree_evenOddDiff.root = new TreeNode(10);
        binaryTree_evenOddDiff.root.left = new TreeNode(20);
        binaryTree_evenOddDiff.root.right = new TreeNode(30);

        System.out.println(binaryTree_evenOddDiff.evenOddDifference(binaryTree_evenOddDiff.root));
    }
}
