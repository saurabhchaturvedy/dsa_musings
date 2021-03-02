package com.dsa.saurabh.level04.BinaryTree.Till30;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BinaryTree_VerticalOrder {


    TreeNode root;


    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }


    private void printVerticalOrder(TreeNode node) {
        if (node == null) return;

        Map<Integer, List<Integer>> heightNodesMap = new TreeMap<>();
        int height = 0;
        getVerticalOrder(node, heightNodesMap, height);

//        heightNodesMap.keySet().forEach((key) -> {
//            System.out.print(heightNodesMap.get(key).stream().mapToInt(x->x.intValue()).sum()+" ");
//
//        });

        heightNodesMap.keySet().forEach((key) -> {
            System.out.println(heightNodesMap.get(key) + " ");
        });
    }

    private void getVerticalOrder(TreeNode node, Map<Integer, List<Integer>> heightNodesMap, int height) {

        if (node == null) {
            return;
        }

        if (heightNodesMap.get(height) == null) {
            List<Integer> nodeList = new ArrayList<>();
            int value = node.data;
            nodeList.add(value);
            heightNodesMap.put(height, nodeList);
        } else {
            List<Integer> integerList = heightNodesMap.get(height);
            int value = node.data;
            integerList.add(value);
            heightNodesMap.put(height, integerList);
        }

        getVerticalOrder(node.left, heightNodesMap, height - 1);
        getVerticalOrder(node.right, heightNodesMap, height + 1);
    }


    public static void main(String[] args) {
        BinaryTree_VerticalOrder binaryTree_verticalOrder = new BinaryTree_VerticalOrder();
        binaryTree_verticalOrder.root = new TreeNode(2);
        binaryTree_verticalOrder.root.left = new TreeNode(7);
        binaryTree_verticalOrder.root.right = new TreeNode(5);
        binaryTree_verticalOrder.root.right.right = new TreeNode(9);
        binaryTree_verticalOrder.root.right.right.left = new TreeNode(4);
        binaryTree_verticalOrder.root.left.right = new TreeNode(6);
        binaryTree_verticalOrder.root.left.right.right = new TreeNode(11);
        binaryTree_verticalOrder.root.left.right.left = new TreeNode(5);
        binaryTree_verticalOrder.root.left.left = new TreeNode(3);

        binaryTree_verticalOrder.printVerticalOrder(binaryTree_verticalOrder.root);
    }
}
