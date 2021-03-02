package com.dsa.saurabh.level04.BinaryTree.Till30;

public class BinaryTree_Identical {

    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private boolean areTreesIdentical(TreeNode first, TreeNode second) {
        if (first == null && second == null) {
            return true;
        }

        if (first == null || second == null) {
            return false;
        }

        return (first.data == second.data) && areTreesIdentical(first.left, second.left) && areTreesIdentical(first.right, second.right);

    }

    public static void main(String[] args) {

        BinaryTree_Identical binaryTree_identical = new BinaryTree_Identical();
        TreeNode first = new TreeNode(1);
        first.left = new TreeNode(2);
        first.left.left = new TreeNode(4);
        first.left.right = new TreeNode(5);
        first.right = new TreeNode(3);
        first.right.right = new TreeNode(7);
        first.right.left = new TreeNode(6);


        TreeNode second = new TreeNode(1);
        second.left = new TreeNode(2);
        second.left.left = new TreeNode(4);
        second.left.right = new TreeNode(5);
        second.right = new TreeNode(3);
        second.right.right = new TreeNode(7);
        second.right.left = new TreeNode(6);

        System.out.println("are identical ? : " + binaryTree_identical.areTreesIdentical(first, second));
    }
}
