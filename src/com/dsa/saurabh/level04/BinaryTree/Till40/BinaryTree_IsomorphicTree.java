package com.dsa.saurabh.level04.BinaryTree.Till40;

public class BinaryTree_IsomorphicTree {


    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private boolean isIsomorphic(TreeNode first, TreeNode second) {
        if (first == null && second == null) {
            return true;
        }

        if (first == null || second == null) {
            return false;
        }

        if (first.data != second.data) {
            return false;
        }

        return (isIsomorphic(first.left, second.left) && isIsomorphic(first.right, second.right) || isIsomorphic(first.left, second.right) && isIsomorphic(first.right, second.left));
    }


    private void add(TreeNode parent, TreeNode child, String childType) {
        if (childType.equals("l")) {
            parent.left = child;
        } else {
            parent.right = child;
        }
    }


    public static void main(String[] args) {
        BinaryTree_IsomorphicTree binaryTree_isomorphicTree = new BinaryTree_IsomorphicTree();
        binaryTree_isomorphicTree.root = new TreeNode(2);
        TreeNode first = new TreeNode(7);
        TreeNode second = new TreeNode(8);
        binaryTree_isomorphicTree.add(binaryTree_isomorphicTree.root, first, "l");
        binaryTree_isomorphicTree.add(binaryTree_isomorphicTree.root, second, "r");

        TreeNode third = new TreeNode(5);
        binaryTree_isomorphicTree.add(first, third, "l");


        TreeNode two_1 = new TreeNode(2);
        TreeNode two_2 = new TreeNode(7);
        TreeNode two_3 = new TreeNode(8);
        TreeNode two_4 = new TreeNode(5);

        binaryTree_isomorphicTree.add(two_1, two_2, "l");
        binaryTree_isomorphicTree.add(two_1, two_3, "r");

        binaryTree_isomorphicTree.add(two_2, two_4, "r");

        boolean isomorphic = binaryTree_isomorphicTree.isIsomorphic(binaryTree_isomorphicTree.root, two_1);

        System.out.println(" are both trees isomorphic to each other ? " + isomorphic);

    }
}
