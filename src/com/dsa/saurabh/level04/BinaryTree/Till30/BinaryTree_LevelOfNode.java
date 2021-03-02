package com.dsa.saurabh.level04.BinaryTree.Till30;

public class BinaryTree_LevelOfNode {

    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private static int levelOfNode(TreeNode node, int data, int level) {
        if (node == null) return 0;

        int l = 0;

        if (node.data == data) {
            return level;
        }

        l = levelOfNode(node.left, data, level + 1);

        if (l != 0) {
            return l;
        }

        l = levelOfNode(node.right, data, level + 1);

        return l;
    }


    public static void main(String[] args) {

        BinaryTree_LevelOfNode binaryTree_levelOfNode = new BinaryTree_LevelOfNode();
        binaryTree_levelOfNode.root = new TreeNode(2);
        binaryTree_levelOfNode.root.left = new TreeNode(7);
        binaryTree_levelOfNode.root.left.right = new TreeNode(6);
        binaryTree_levelOfNode.root.left.right.right = new TreeNode(11);
        binaryTree_levelOfNode.root.left.right.left = new TreeNode(5);
        binaryTree_levelOfNode.root.left.left = new TreeNode(3);
        binaryTree_levelOfNode.root.right = new TreeNode(5);
        binaryTree_levelOfNode.root.right.right = new TreeNode(9);
        binaryTree_levelOfNode.root.right.right.left = new TreeNode(4);

        System.out.println("level of node : " + levelOfNode(binaryTree_levelOfNode.root, 11, 1));

    }
}
