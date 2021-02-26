package com.dsa.saurabh.level01.Tree_CS;
//7
public class BinaryTree_Cousins {

    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private boolean areCousins(TreeNode root, TreeNode first, TreeNode second) {
        if (root == null) return false;

        if (level(first, first.data, 1) != level(second, second.data, 1)) {
            return false;
        }

        return !areSiblings(root, first, second);
    }

    public boolean areSiblings(TreeNode node, TreeNode a, TreeNode b) {
        if (node == null) {
            return false;
        }

        return (node.left == a && node.right == b)
                || (node.left == b && node.right == a)
                || areSiblings(node.left, a, b)
                || areSiblings(node.right, a, b);
    }

    private int level(TreeNode node, int data, int level) {
        if (node == null) return 0;

        if (node.data == data) {
            return level;
        }

        level = level(node.left, data, level + 1);
        if (level != 0) {
            return 1;
        }
        level = level(node.right, data, level + 1);
        return level;
    }


    public static void main(String[] args) {

    }
}
