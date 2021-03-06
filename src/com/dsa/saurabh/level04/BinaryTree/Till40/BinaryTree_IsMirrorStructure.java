package com.dsa.saurabh.level04.BinaryTree.Till40;

public class BinaryTree_IsMirrorStructure {


    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private boolean isMirrorStructure(TreeNode first, TreeNode second) {
        if (first == null && second == null) {
            return true;
        }

        if (first == null || second == null) {
            return false;
        }

        return isMirrorStructure(first.left, second.right) && isMirrorStructure(first.right, second.left);
    }


    private void add(TreeNode parent, TreeNode child, String childType) {
        if (childType.equals("l")) {
            parent.left = child;
        } else {
            parent.right = child;
        }
    }

    public static void main(String[] args) {
        BinaryTree_IsMirrorStructure binaryTree_isMirrorStructure = new BinaryTree_IsMirrorStructure();
        binaryTree_isMirrorStructure.root = new TreeNode(1);
        TreeNode first = new TreeNode(2);
        TreeNode second = new TreeNode(3);
        binaryTree_isMirrorStructure.add(binaryTree_isMirrorStructure.root, first, "l");
        binaryTree_isMirrorStructure.add(binaryTree_isMirrorStructure.root, second, "r");

        TreeNode two = new TreeNode(1);
        TreeNode two_1 = new TreeNode(3);
        TreeNode two_2 = new TreeNode(2);

        binaryTree_isMirrorStructure.add(two, two_1, "l");
        binaryTree_isMirrorStructure.add(two, two_2, "r");

        boolean mirror = binaryTree_isMirrorStructure.isMirrorStructure(binaryTree_isMirrorStructure.root, two);

        System.out.println("are these 2 trees mirror structures w.r.t each other : ? " + mirror);
    }
}
