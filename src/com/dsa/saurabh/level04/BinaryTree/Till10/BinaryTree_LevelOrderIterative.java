package com.dsa.saurabh.level04.BinaryTree.Till10;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree_LevelOrderIterative {


    TreeNode root;


    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    private void levelOrderIterative(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);

        while (!nodeQueue.isEmpty()) {
            TreeNode temp = nodeQueue.poll();

            System.out.print(temp.data + " ");

            if (temp.left != null) {
                nodeQueue.offer(temp.left);
            }

            if (temp.right != null) {
                nodeQueue.offer(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree_LevelOrderIterative binaryTree_levelOrderIterative = new BinaryTree_LevelOrderIterative();
        binaryTree_levelOrderIterative.root = new TreeNode(10);
        binaryTree_levelOrderIterative.root.left = new TreeNode(20);
        binaryTree_levelOrderIterative.root.right = new TreeNode(30);

        binaryTree_levelOrderIterative.levelOrderIterative(binaryTree_levelOrderIterative.root);
    }
}
