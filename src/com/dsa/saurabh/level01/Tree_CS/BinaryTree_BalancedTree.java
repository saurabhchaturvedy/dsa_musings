package com.dsa.saurabh.level01.Tree_CS;

//4
public class BinaryTree_BalancedTree {

    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    boolean isTreeBalanced(TreeNode node) {
        int lh; /* for height of left subtree */

        int rh; /* for height of right subtree */

        if (node == null)
            return true;

        /* Get the height of left and right sub trees */
        lh = height(node.left);
        rh = height(node.right);

        if (Math.abs(lh - rh) <= 1
                && isTreeBalanced(node.left)
                && isTreeBalanced(node.right))
            return true;

        /* If we reach here then tree is not height-balanced */
        return false;
    }


    private int height(TreeNode node) {

        if (node == null) return 0;

        int lh = height(node.left);
        int rh = height(node.right);

        return 1 + Math.max(lh, rh);
    }


    public static void main(String[] args) {

        BinaryTree_BalancedTree binaryTree_balancedTree = new BinaryTree_BalancedTree();
        binaryTree_balancedTree.root = new TreeNode(10);
        binaryTree_balancedTree.root.left = new TreeNode(20);
        binaryTree_balancedTree.root.right = new TreeNode(30);
        binaryTree_balancedTree.root.right.right = new TreeNode(30);
        binaryTree_balancedTree.root.right.right.right = new TreeNode(30);

        System.out.println(binaryTree_balancedTree.isTreeBalanced(binaryTree_balancedTree.root));

    }
}
