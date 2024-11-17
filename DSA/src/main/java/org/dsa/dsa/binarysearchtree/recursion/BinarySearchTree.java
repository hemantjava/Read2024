package org.dsa.dsa.binarysearchtree.recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;

    public void insert(T data) {
        root = insertRecursive(root, data);
    }

    private Node<T> insertRecursive(Node<T> root, T data) {
        if (root == null)
            return new Node<>(data);
        if (data.compareTo(root.data) < 0)
            root.left = insertRecursive(root.left, data);
        else if (data.compareTo(root.data) > 0)
            root.right = insertRecursive(root.right, data);
        return root;
    }

    public boolean search(T data) {
        return searchRecursive(root, data);
    }

    private boolean searchRecursive(Node<T> root, T data) {
        if (root == null)
            return false;
        if (data.compareTo(root.data) == 0)
            return true;
        else if (data.compareTo(root.data) < 0)
            return searchRecursive(root.left, data);
        return searchRecursive(root.right, data);

    }

    public void delete(T data) {
        root = deleteRecursive(root, data);
    }

    private Node<T> deleteRecursive(Node<T> root, T data) {
        if (root == null) {
            return null;
        }

        if (data.compareTo(root.data) < 0) {
            root.left = deleteRecursive(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = deleteRecursive(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);
            root.right = deleteRecursive(root.right, root.data);
        }

        return root;
    }

    private T minValue(Node<T> root) { // minValue is always left side of the tree
        T minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    public void inorderTraversal() {  // always sorted form data  -> left - root - right note:- root middle print data in middle
        inorderTraversalRecursive(root);
    }

    private void inorderTraversalRecursive(Node<T> root) {
        if (root != null) {
            inorderTraversalRecursive(root.left);
            System.out.print(root.data + " ");
            inorderTraversalRecursive(root.right);
        }
    }

    public void postorderTraversal() {      // -> left - right - root note:- root end print data in end
        postorderTraversalRecursive(root);
    }

    private void postorderTraversalRecursive(Node<T> root) {
        if (root != null) {
            postorderTraversalRecursive(root.left);
            postorderTraversalRecursive(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void preorderTraversal() {//note:- root first print data in first
        preorderTraversalRecursive(root);
    }

    private void preorderTraversalRecursive(Node<T> root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderTraversalRecursive(root.left);
            preorderTraversalRecursive(root.right);
        }
    }

    public List<T> breadthFirstSearch(){
        Queue<Node<T>> queue = new LinkedList<>(); //hold node
        List<T> result = new ArrayList<>();//hold data
        queue.add(root);
        while (!queue.isEmpty()){
            Node<T> currentNode = queue.remove();//dequeue
            result.add(currentNode.data);
            if (currentNode.left != null){
                queue.add(currentNode.left);
            }if (currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
       return  result;
    }

    public T minValue() {
        return minValue(root);
    }

    public T maxValue() {
        return maxValue(root);
    }

    private T maxValue(Node<T> root) {
        T maxValue = root.data;
        while (root.right != null) {
            maxValue = root.right.data;
            root = root.right;
        }
        return maxValue;
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        int[] data = {50, 30, 70, 20, 40};
        for (int val : data) {
            bst.insert(val);
        }
        System.out.println("Inorder Traversal:");
        bst.inorderTraversal();
        System.out.println("\nPostorder Traversal:");
        bst.postorderTraversal();
        System.out.println("\nPreorder Traversal:");
        bst.preorderTraversal();
        System.out.println("\nminValue: " + bst.minValue());
        System.out.println("maxValue: " + bst.maxValue());
        System.out.println("search 50:" + bst.search(50));
        System.out.println(bst.breadthFirstSearch());


    }
}