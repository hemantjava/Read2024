package org.dsa.dsa.binarysearchtree;

//TimeComplexity
public class BinarySearchTree {

     Node rootNode; //head

    public BinarySearchTree(int value) {
        Node newNode = new Node(value);
        rootNode = newNode;
    }

    public BinarySearchTree() {

    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "rootNode=" + rootNode +
                '}';
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (rootNode == null) {
            rootNode = newNode;
            return true;
        }
        Node temp = rootNode;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }

    }

    static class Node {
         int value;
         Node left;
         Node right;

        Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
