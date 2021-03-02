package com.dsa.saurabh.level04.BinaryTree.Till30;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree_SumAtEachLevel {

    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private void levelWiseSum(TreeNode node) {
        if (node == null) {
            return;
        }

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(node);

        while (true) {
            int size = nodeQueue.size();
            if (size == 0) {
                break;
            }
            int sumAtEachLevel = 0;
            while (size>0) {
                TreeNode temp = nodeQueue.poll();
                sumAtEachLevel = sumAtEachLevel + temp.data;

                if (temp.left != null) {
                    nodeQueue.offer(temp.left);
                }

                if (temp.right != null) {
                    nodeQueue.offer(temp.right);
                }

                size--;

            }

            System.out.println(sumAtEachLevel + " ");
        }
    }


    public static void main(String[] args) {

        BinaryTree_SumAtEachLevel binaryTree_sumAtEachLevel = new BinaryTree_SumAtEachLevel();
        binaryTree_sumAtEachLevel.root = new TreeNode(2);
        binaryTree_sumAtEachLevel.root.left = new TreeNode(7);
        binaryTree_sumAtEachLevel.root.right = new TreeNode(5);
        binaryTree_sumAtEachLevel.root.right.right = new TreeNode(9);
        binaryTree_sumAtEachLevel.root.left.right = new TreeNode(6);
        binaryTree_sumAtEachLevel.root.left.right.left = new TreeNode(5);
        binaryTree_sumAtEachLevel.root.left.right.right = new TreeNode(11);
        binaryTree_sumAtEachLevel.root.left.right.left.left = new TreeNode(10);

        binaryTree_sumAtEachLevel.levelWiseSum(binaryTree_sumAtEachLevel.root);

    }
}
