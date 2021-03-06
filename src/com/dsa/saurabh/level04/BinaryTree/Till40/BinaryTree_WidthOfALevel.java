package com.dsa.saurabh.level04.BinaryTree.Till40;

public class BinaryTree_WidthOfALevel {


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


    private int getLevelWidth(TreeNode node, int level) {
        if (node == null) return 0;

        if (level == 1) return 1;

        return getLevelWidth(node.left, level - 1) + getLevelWidth(node.right, level - 1);
    }


    public static void main(String[] args) {
        BinaryTree_WidthOfALevel binaryTree_widthOfALevel = new BinaryTree_WidthOfALevel();
        binaryTree_widthOfALevel.root = new TreeNode(2);

        TreeNode first = new TreeNode(7);
        TreeNode second = new TreeNode(5);

        binaryTree_widthOfALevel.add(binaryTree_widthOfALevel.root, first, "l");
        binaryTree_widthOfALevel.add(binaryTree_widthOfALevel.root, second, "r");

        TreeNode third = new TreeNode(2);
        TreeNode fourth = new TreeNode(6);
        TreeNode fifth = new TreeNode(9);

        binaryTree_widthOfALevel.add(first, third, "l");
        binaryTree_widthOfALevel.add(first, fourth, "r");
        binaryTree_widthOfALevel.add(second, fifth, "r");

        TreeNode sixth = new TreeNode(5);
        TreeNode seven = new TreeNode(11);
        TreeNode eight = new TreeNode(4);

        binaryTree_widthOfALevel.add(fourth, sixth, "l");
        binaryTree_widthOfALevel.add(fourth, seven, "r");

        binaryTree_widthOfALevel.add(fifth, eight, "l");

        int levelWidth = binaryTree_widthOfALevel.getLevelWidth(binaryTree_widthOfALevel.root, 2);

        System.out.println("width of the level is :" + levelWidth);
    }
}
