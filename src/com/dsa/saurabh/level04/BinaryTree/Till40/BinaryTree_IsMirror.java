package com.dsa.saurabh.level04.BinaryTree.Till40;

public class BinaryTree_IsMirror {

    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private boolean isMirror(TreeNode first, TreeNode second) {
        if (first == null && second == null) {
            return true;
        }

        if (first == null || second == null) {
            return false;
        }

        return first.data == second.data && isMirror(first.left, second.right) && isMirror(first.right, second.left);
    }


    private void add(TreeNode parent, TreeNode child, String childType) {
        if (childType.equals("l")) {
            parent.left = child;
        } else {
            parent.right = child;
        }
    }


    public static void main(String[] args) {
        BinaryTree_IsMirror binaryTree_isMirror = new BinaryTree_IsMirror();
        binaryTree_isMirror.root = new TreeNode(1);
        TreeNode first = new TreeNode(2);
        TreeNode second = new TreeNode(3);
        binaryTree_isMirror.add(binaryTree_isMirror.root, first, "l");
        binaryTree_isMirror.add(binaryTree_isMirror.root, second, "r");

        TreeNode two = new TreeNode(1);
        TreeNode two_1 = new TreeNode(3);
        TreeNode two_2 = new TreeNode(2);

        binaryTree_isMirror.add(two, two_1, "l");
        binaryTree_isMirror.add(two, two_2, "r");

        boolean mirror = binaryTree_isMirror.isMirror(binaryTree_isMirror.root, two);

        System.out.println("are these 2 trees mirrors of each other : ? " + mirror);
    }
}
