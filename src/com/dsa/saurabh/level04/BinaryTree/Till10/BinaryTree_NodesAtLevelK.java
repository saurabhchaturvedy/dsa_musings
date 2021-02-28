package com.dsa.saurabh.level04.BinaryTree.Till10;

public class BinaryTree_NodesAtLevelK {


    TreeNode root;


    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
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
        BinaryTree_NodesAtLevelK binaryTree_nodesAtLevelK = new BinaryTree_NodesAtLevelK();
        binaryTree_nodesAtLevelK.root = new TreeNode(10);
        binaryTree_nodesAtLevelK.root.left = new TreeNode(20);
        binaryTree_nodesAtLevelK.root.right = new TreeNode(30);

        binaryTree_nodesAtLevelK.printNodesAtLevelK(binaryTree_nodesAtLevelK.root, 2);
    }
}
