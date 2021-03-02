package com.dsa.saurabh.level04.BinaryTree.Till30;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

//24
public class BinaryTree_TopView {

    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        int height;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private void printTopView(TreeNode node) {
        if (node == null) return;
        TreeMap<Integer, Integer> heightValueMap = new TreeMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            int height = temp.height;

            if (heightValueMap.get(height) == null) {
                heightValueMap.put(height, temp.data);
            }

            if (temp.left != null) {
                temp.left.height = height - 1;
                queue.offer(temp.left);
            }

            if (temp.right != null) {
                temp.right.height = height + 1;
                queue.offer(temp.right);
            }

        }
        System.out.print(heightValueMap.values());
    }


    public static void main(String[] args) {

        BinaryTree_TopView binaryTree_topView = new BinaryTree_TopView();
        binaryTree_topView.root = new TreeNode(2);
        binaryTree_topView.root.left = new TreeNode(7);
        binaryTree_topView.root.right = new TreeNode(5);
        binaryTree_topView.root.right.right = new TreeNode(9);
        binaryTree_topView.root.left.right = new TreeNode(6);
        binaryTree_topView.root.left.right.left = new TreeNode(5);
        binaryTree_topView.root.left.right.right = new TreeNode(11);
        binaryTree_topView.root.left.right.left.left = new TreeNode(10);

        binaryTree_topView.printTopView(binaryTree_topView.root);

    }
}
