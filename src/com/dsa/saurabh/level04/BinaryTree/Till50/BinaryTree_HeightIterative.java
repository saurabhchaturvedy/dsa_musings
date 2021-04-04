package com.dsa.saurabh.level04.BinaryTree.Till50;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree_HeightIterative {

    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private void add(TreeNode parent, TreeNode child, String childType) {
        if (childType.equals("l")) {
            parent.left = child;
        } else {
            parent.right = child;
        }
    }

    private void display(TreeNode node) {
        if (node == null) return;
        display(node.left);
        System.out.print(node.data + " ");
        display(node.right);
    }

    private int heightIterative(TreeNode node) {
        if (node == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        int height = 0;

        while (true) {
            int size = queue.size();
            if (size == 0) {
                break;
            }
            height=height+1;
            while (size > 0) {
                TreeNode temp = queue.poll();

                if (temp.left != null) {
                    queue.offer(temp.left);
                }

                if (temp.right != null) {
                    queue.offer(temp.right);
                }

                size--;
            }
        }

        return height;
    }


    private int heightRecursive(TreeNode node) {
        if (node == null) return -1;
        int lh = heightIterative(node.left);
        int rh = heightIterative(node.right);
        return Math.max(lh, rh) + 1;
    }


    public static void main(String[] args) {
        BinaryTree_HeightIterative binaryTree_heightIterative = new BinaryTree_HeightIterative();
        binaryTree_heightIterative.root = new TreeNode(10);
        TreeNode first = new TreeNode(20);
        TreeNode second = new TreeNode(30);
        binaryTree_heightIterative.add(binaryTree_heightIterative.root, first, "l");
        binaryTree_heightIterative.add(binaryTree_heightIterative.root, second, "r");
        binaryTree_heightIterative.display(binaryTree_heightIterative.root);

        int i = binaryTree_heightIterative.heightIterative(binaryTree_heightIterative.root);

        System.out.println("height of the tree is : " + i);

        System.out.println("height recursively is : " + binaryTree_heightIterative.heightRecursive(binaryTree_heightIterative.root));
    }
}
