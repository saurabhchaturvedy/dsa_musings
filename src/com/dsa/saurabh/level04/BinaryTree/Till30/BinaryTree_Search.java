package com.dsa.saurabh.level04.BinaryTree.Till30;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree_Search {


    TreeNode root;


    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private boolean recursiveSearch(TreeNode node, int key) {
        if (node == null) return false;

        if (node.data == key) return true;

        return recursiveSearch(node.left, key) || recursiveSearch(node.right, key);
    }


    private boolean iterativeSearch(TreeNode node, int key) {
        if (node == null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();

            if (temp.data == key) return true;

            if (temp.left != null) {
                queue.offer(temp.left);
            }

            if (temp.right != null) {
                queue.offer(temp.right);
            }


        }

        return false;
    }

    public static void main(String[] args) {


        BinaryTree_Search binaryTree_search = new BinaryTree_Search();
        binaryTree_search.root = new TreeNode(2);
        binaryTree_search.root.left = new TreeNode(7);
        binaryTree_search.root.right = new TreeNode(5);
        binaryTree_search.root.right.right = new TreeNode(9);
        binaryTree_search.root.left.right = new TreeNode(6);
        binaryTree_search.root.left.right.left = new TreeNode(5);
        binaryTree_search.root.left.right.right = new TreeNode(11);
        binaryTree_search.root.left.right.left.left = new TreeNode(10);

        System.out.println("Element Found Recursive ? : " + binaryTree_search.recursiveSearch(binaryTree_search.root, 15));

        System.out.println("Element Found Iterative ? : " + binaryTree_search.iterativeSearch(binaryTree_search.root, 5));
    }
}
