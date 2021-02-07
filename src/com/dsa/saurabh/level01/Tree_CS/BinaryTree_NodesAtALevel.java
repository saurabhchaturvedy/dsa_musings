package com.dsa.saurabh.level01.Tree_CS;

public class BinaryTree_NodesAtALevel {

    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    private void printNodesAtALevel(TreeNode node, int level) {
        if (node == null) return;

        if (level == 1) {
            System.out.println(node.data + " ");
            return;
        }

        printNodesAtALevel(node.left, level - 1);
        printNodesAtALevel(node.right, level - 1);
    }

    public static void main(String[] args) {
        BinaryTree_NodesAtALevel binaryTree_nodesAtALevel = new BinaryTree_NodesAtALevel();
        binaryTree_nodesAtALevel.root = new TreeNode(10);
        binaryTree_nodesAtALevel.root.left = new TreeNode(20);
        binaryTree_nodesAtALevel.root.left.left = new TreeNode(30);
        binaryTree_nodesAtALevel.root.left.right = new TreeNode(40);
        binaryTree_nodesAtALevel.root.right = new TreeNode(50);
        binaryTree_nodesAtALevel.root.right.left = new TreeNode(60);
        binaryTree_nodesAtALevel.root.right.right = new TreeNode(70);


        binaryTree_nodesAtALevel.printNodesAtALevel(binaryTree_nodesAtALevel.root, 3);
    }
}
