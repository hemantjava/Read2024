package org.dsa.dsa.binarysearchtree.rc;


public class BinarySearchTree<T extends Comparable<T>> {
    Node<T> root; // root node

    public void insert(T data) {
        root = insertRecursive(root, data);
    }


    private Node<T> insertRecursive(Node<T> root, T data) {
        if (root == null) return new Node<>(data);
        if (data.compareTo(root.data) < 0) // data is less than root data left inserting
            root.left = insertRecursive(root.left, data);
        else if (data.compareTo(root.data) > 0)// data is greater than root data right inserting
            root.right = insertRecursive(root.right, data);
        return root;
    }

    public void preOrderTraversal() {
        preOrderTraversalRecursive(root);
    }

    private void preOrderTraversalRecursive(Node<T> root) {
        if (root != null) {
            System.out.println(root.data + " ");
            preOrderTraversalRecursive(root.left);
            preOrderTraversalRecursive(root.right);
        }
    }

    public void postOrderTraversal() {
        postOrderTraversalRecursive(root);
    }

    private void postOrderTraversalRecursive(Node<T> root) {
        if (root != null) {
            preOrderTraversalRecursive(root.left);
            preOrderTraversalRecursive(root.right);
            System.out.println(root.data + " ");
        }
    }

    public void inOrderTraversal() {
        inOrderTraversalRecursive(root);
    }

    private void inOrderTraversalRecursive(Node<T> root) {
        if (root != null) {
            preOrderTraversalRecursive(root.left);
            System.out.println(root.data + " ");
            preOrderTraversalRecursive(root.right);
        }
    }

    public boolean search(T data) {
        return searchRecursive(root, data);
    }

    private boolean searchRecursive(Node<T> root, T data) {
        if (root == null)
            return false;
        if (data.compareTo(root.data) == 0) {
            System.out.println(data);
            return true;
        } else if (data.compareTo(root.data) < 0) {
            return searchRecursive(root.left, data);
        }
        return searchRecursive(root.right, data);
    }

    public T minValue() {
        return minValue(root);
    }

    private T minValue(Node<T> root) {
        T minValue = root.data; // 1st element root data
        while (root.left != null) {//minValue always on the left side subtree
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    public void delete(T data) {
        root = deleteRecursive(root, data);
        System.out.println(root.data);
    }

    private Node<T> deleteRecursive(Node<T> root, T data) {
        if (root == null) return null;

        //Traverse the children tree to find the node
        if (data.compareTo(root.data) < 0) {
            root.left = deleteRecursive(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = deleteRecursive(root.right, data);
        } else {
            //Node to be deleted found
            //case 1 & 2 : Node with one or no children
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            //case 3 : Node with two children
            root.data = minValue(root.right);
            root.right = deleteRecursive(root.right, data);
        }
        return root;
    }

}
