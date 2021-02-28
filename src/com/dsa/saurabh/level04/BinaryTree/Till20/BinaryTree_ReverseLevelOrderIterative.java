package com.dsa.saurabh.level04.BinaryTree.Till20;

import com.dsa.saurabh.level04.BinaryTree.Till10.BinaryTree_LevelOrderIterative;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree_ReverseLevelOrderIterative {


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

        Stack<TreeNode> nodeStack = new Stack<>();

        while (!nodeQueue.isEmpty()) {
            TreeNode temp = nodeQueue.poll();

            nodeStack.push(temp);

            if (temp.left != null) {
                nodeQueue.offer(temp.left);
            }

            if (temp.right != null) {
                nodeQueue.offer(temp.right);
            }
        }

        while (!nodeStack.isEmpty()) {
            System.out.print(nodeStack.pop().data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree_ReverseLevelOrderIterative binaryTree_reverseLevelOrderIterative = new BinaryTree_ReverseLevelOrderIterative();
        binaryTree_reverseLevelOrderIterative.root = new TreeNode(10);
        binaryTree_reverseLevelOrderIterative.root.left = new TreeNode(20);
        binaryTree_reverseLevelOrderIterative.root.right = new TreeNode(30);

        binaryTree_reverseLevelOrderIterative.levelOrderIterative(binaryTree_reverseLevelOrderIterative.root);
    }
}
