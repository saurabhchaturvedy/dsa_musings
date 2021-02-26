package com.dsa.saurabh.level01.Tree_CS;

import java.util.ArrayList;
import java.util.List;
//22
public class BinaryTree_SerializeDeserialize {

    TreeNode root;

    private static class TreeNode {
        TreeNode left;
        TreeNode right;
        int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }


    private void serialize(TreeNode node, List<Integer> list) {
        if (node == null) {
            list.add(-1);
            return;
        }

        list.add(node.data);
        serialize(node.left, list);
        serialize(node.right, list);
    }

    int deserializationIndex = 0;

    private TreeNode deserialize(List<Integer> list) {
        if (list.get(deserializationIndex) == -1) {
            deserializationIndex++;
            return null;
        }

        TreeNode node = new TreeNode(list.get(deserializationIndex++));
        node.left = deserialize(list);
        node.right = deserialize(list);
        return node;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }


    public static void main(String[] args) {
        BinaryTree_SerializeDeserialize binaryTree_serializeDeserialize = new BinaryTree_SerializeDeserialize();
        binaryTree_serializeDeserialize.root = new TreeNode(10);
        binaryTree_serializeDeserialize.root.left = new TreeNode(20);
        binaryTree_serializeDeserialize.root.right = new TreeNode(30);
        binaryTree_serializeDeserialize.root.left.left = new TreeNode(40);
        binaryTree_serializeDeserialize.root.left.left.right = new TreeNode(50);
        binaryTree_serializeDeserialize.root.right.right = new TreeNode(60);

        binaryTree_serializeDeserialize.inorder(binaryTree_serializeDeserialize.root);

        List<Integer> serializedNodeData = new ArrayList<>();
        binaryTree_serializeDeserialize.serialize(binaryTree_serializeDeserialize.root, serializedNodeData);
        TreeNode deserialize = binaryTree_serializeDeserialize.deserialize(serializedNodeData);
        System.out.println();
        binaryTree_serializeDeserialize.inorder(deserialize);

    }
}
