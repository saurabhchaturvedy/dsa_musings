package com.dsa.saurabh.level04.BinaryTree.Till40;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree_NodesBetweenTwoLevels {

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


    private void printNodeBetweenLevels(TreeNode node, int low, int high) {
        if (node == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        int level = 1;

        while (true) {
            int size = queue.size();
            if (size == 0 || level > high) {
                break;
            }

            while (size > 0) {
                TreeNode temp = queue.poll();
                if (level >= low && level <= high) {
                    System.out.print(temp.data + " ");
                }

                if (temp.left != null) {
                    queue.offer(temp.left);
                }

                if (temp.right != null) {
                    queue.offer(temp.right);
                }

                size--;
            }

            level++;
        }
    }


    public static void main(String[] args) {
        BinaryTree_NodesBetweenTwoLevels binaryTree_nodesBetweenTwoLevels = new BinaryTree_NodesBetweenTwoLevels();
        binaryTree_nodesBetweenTwoLevels.root = new TreeNode(2);
        TreeNode second = new TreeNode(7);
        TreeNode third = new TreeNode(5);
        binaryTree_nodesBetweenTwoLevels.add(binaryTree_nodesBetweenTwoLevels.root, second, "l");
        binaryTree_nodesBetweenTwoLevels.add(binaryTree_nodesBetweenTwoLevels.root, third, "r");
        TreeNode fourth = new TreeNode(3);
        TreeNode fifth = new TreeNode(6);
        TreeNode sixth = new TreeNode(9);
        binaryTree_nodesBetweenTwoLevels.add(second, fourth, "l");
        binaryTree_nodesBetweenTwoLevels.add(second, fifth, "r");
        binaryTree_nodesBetweenTwoLevels.add(third, sixth, "r");
        TreeNode seventh = new TreeNode(8);
        TreeNode eighth = new TreeNode(11);
        TreeNode nine = new TreeNode(4);

        binaryTree_nodesBetweenTwoLevels.add(fifth, seventh, "l");
        binaryTree_nodesBetweenTwoLevels.add(fifth, eighth, "r");
        binaryTree_nodesBetweenTwoLevels.add(sixth, nine, "l");

        binaryTree_nodesBetweenTwoLevels.display(binaryTree_nodesBetweenTwoLevels.root);

        System.out.println();

        System.out.println("printing nodes between levels : ");

        binaryTree_nodesBetweenTwoLevels.printNodeBetweenLevels(binaryTree_nodesBetweenTwoLevels.root, 2, 4);
    }
}
