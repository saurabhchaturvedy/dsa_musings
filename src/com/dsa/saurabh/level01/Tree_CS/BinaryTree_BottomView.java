package com.dsa.saurabh.level01.Tree_CS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;
//5
public class BinaryTree_BottomView {


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


    private void printBottomView(TreeNode node) {
        TreeMap<Integer, Integer> heightValueMap = new TreeMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            int height = temp.height;
            heightValueMap.put(height, temp.data);

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
        BinaryTree_BottomView binaryTree_bottomView = new BinaryTree_BottomView();
        binaryTree_bottomView.root = new TreeNode(1);
        binaryTree_bottomView.root.left = new TreeNode(2);
        binaryTree_bottomView.root.right = new TreeNode(3);
        binaryTree_bottomView.root.right.right = new TreeNode(7);
        binaryTree_bottomView.root.left.right = new TreeNode(5);
        binaryTree_bottomView.root.left.left = new TreeNode(4);
        binaryTree_bottomView.root.left.left.right = new TreeNode(9);
        binaryTree_bottomView.root.left.left.left = new TreeNode(8);

        binaryTree_bottomView.printBottomView(binaryTree_bottomView.root);
    }
}
