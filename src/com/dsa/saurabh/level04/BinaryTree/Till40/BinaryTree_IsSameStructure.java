package com.dsa.saurabh.level04.BinaryTree.Till40;

public class BinaryTree_IsSameStructure {

    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private boolean isSameStructure(TreeNode first, TreeNode second) {
        if (first == null && second == null) {
            return true;
        }

        if (first == null || second == null) {
            return false;
        }

        return isSameStructure(first.left, second.left) && isSameStructure(first.right, second.right);
    }


    private void add(TreeNode parent, TreeNode child, String childType) {
        if (childType.equals("l")) {
            parent.left = child;
        } else {
            parent.right = child;
        }
    }


    public static void main(String[] args) {
        BinaryTree_IsSameStructure binaryTree_isSameStructure = new BinaryTree_IsSameStructure();
        binaryTree_isSameStructure.root = new TreeNode(1);
        TreeNode first = new TreeNode(2);
        TreeNode second = new TreeNode(3);
        binaryTree_isSameStructure.add(binaryTree_isSameStructure.root, first, "l");
        binaryTree_isSameStructure.add(binaryTree_isSameStructure.root, second, "r");

        TreeNode two = new TreeNode(1);
        TreeNode two_1 = new TreeNode(3);
        TreeNode two_2 = new TreeNode(2);

        binaryTree_isSameStructure.add(two, two_1, "l");
        binaryTree_isSameStructure.add(two, two_2, "r");

        boolean isSameStructure = binaryTree_isSameStructure.isSameStructure(binaryTree_isSameStructure.root, two);

        System.out.println("are these 2 trees same structures w.r.t each other : ? " + isSameStructure);
    }
}
