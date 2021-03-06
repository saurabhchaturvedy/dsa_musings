package com.dsa.saurabh.level04.BinaryTree.Till40;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree_MaxWidth {

    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private int getMaximumWidth(TreeNode node) {
        if (node == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        int maxWidth = 1;

        while (true) {
            int size = queue.size();
            if (size == 0) {
                break;
            }

            if (size > maxWidth) {
                maxWidth = size;
            }

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
        return maxWidth;
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

    public static void main(String[] args) {
        BinaryTree_MaxWidth binaryTree_maxWidth = new BinaryTree_MaxWidth();
        binaryTree_maxWidth.root = new TreeNode(2);
        TreeNode second = new TreeNode(7);
        TreeNode third = new TreeNode(9);

        binaryTree_maxWidth.add(binaryTree_maxWidth.root, second, "l");
        binaryTree_maxWidth.add(binaryTree_maxWidth.root, third, "r");

        TreeNode fourth = new TreeNode(12);
        TreeNode fifth = new TreeNode(6);
        TreeNode sixth = new TreeNode(4);
        TreeNode seventh = new TreeNode(40);

        binaryTree_maxWidth.add(second, fourth, "l");
        binaryTree_maxWidth.add(second, fifth, "r");
        binaryTree_maxWidth.add(third, sixth, "l");
        binaryTree_maxWidth.add(third, seventh, "r");

        TreeNode eighth = new TreeNode(5);
        TreeNode nine = new TreeNode(11);

        binaryTree_maxWidth.add(fifth, eighth, "l");
        binaryTree_maxWidth.add(fifth, nine, "r");

        binaryTree_maxWidth.display(binaryTree_maxWidth.root);

        System.out.println();

        int maximumWidth = binaryTree_maxWidth.getMaximumWidth(binaryTree_maxWidth.root);

        System.out.println("Maximum width of binary tree is : " + maximumWidth);
    }
}
