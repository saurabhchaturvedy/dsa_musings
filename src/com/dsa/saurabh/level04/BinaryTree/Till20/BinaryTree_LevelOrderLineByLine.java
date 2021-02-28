package com.dsa.saurabh.level04.BinaryTree.Till20;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree_LevelOrderLineByLine {


    TreeNode root;


    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private void levelOrderLineByLine(TreeNode node) {
        if (node == null) return;

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(node);

        while (true) {
            int count = nodeQueue.size();
            if (count == 0)
                break;

            while (count > 0) {
                TreeNode temp = nodeQueue.poll();

                System.out.print(temp.data + " ");

                if (temp.left != null) {
                    nodeQueue.offer(temp.left);
                }

                if (temp.right != null) {
                    nodeQueue.offer(temp.right);
                }

                count--;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        BinaryTree_LevelOrderLineByLine binaryTree_levelOrderLineByLine = new BinaryTree_LevelOrderLineByLine();
        binaryTree_levelOrderLineByLine.root = new TreeNode(2);
        binaryTree_levelOrderLineByLine.root.left = new TreeNode(7);
        binaryTree_levelOrderLineByLine.root.right = new TreeNode(6);


        binaryTree_levelOrderLineByLine.levelOrderLineByLine(binaryTree_levelOrderLineByLine.root);
    }
}
