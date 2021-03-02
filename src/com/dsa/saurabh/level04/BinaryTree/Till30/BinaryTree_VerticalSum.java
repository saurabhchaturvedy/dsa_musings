package com.dsa.saurabh.level04.BinaryTree.Till30;

import java.util.Map;
import java.util.TreeMap;

public class BinaryTree_VerticalSum {

    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    private void verticalSum(TreeNode node) {
        if (node == null) {
            return;
        }
        int height = 0;
        Map<Integer, Integer> heightNodeSumMap = new TreeMap<>();
        getVerticalSum(node, heightNodeSumMap, height);

        heightNodeSumMap.keySet().forEach((key) -> {
            System.out.println(heightNodeSumMap.get(key) + " ");
        });
    }

    private void getVerticalSum(TreeNode node, Map<Integer, Integer> heightNodeSumMap, int height) {

        if (node == null) {
            return;
        }

        getVerticalSum(node.left, heightNodeSumMap, height - 1);

        if (heightNodeSumMap.get(height) != null) {
            heightNodeSumMap.put(height,heightNodeSumMap.get(height) + node.data);
        } else {
            heightNodeSumMap.put(height,node.data);
        }

        getVerticalSum(node.right, heightNodeSumMap, height + 1);
    }

    public static void main(String[] args) {
        BinaryTree_VerticalSum binaryTree_verticalOrderSum = new BinaryTree_VerticalSum();
        binaryTree_verticalOrderSum.root = new TreeNode(2);
        binaryTree_verticalOrderSum.root.left = new TreeNode(7);
        binaryTree_verticalOrderSum.root.right = new TreeNode(5);
        binaryTree_verticalOrderSum.root.right.right = new TreeNode(9);
        binaryTree_verticalOrderSum.root.right.right.left = new TreeNode(4);
        binaryTree_verticalOrderSum.root.left.right = new TreeNode(6);
        binaryTree_verticalOrderSum.root.left.right.right = new TreeNode(11);
        binaryTree_verticalOrderSum.root.left.right.left = new TreeNode(5);
        binaryTree_verticalOrderSum.root.left.left = new TreeNode(3);

        binaryTree_verticalOrderSum.verticalSum(binaryTree_verticalOrderSum.root);
    }
}
