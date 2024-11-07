package org.dsa.dsa.binarysearchtree.rc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    void insert() {
        BinarySearchTree<Character> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert('c');
        binarySearchTree.insert('b');
        binarySearchTree.insert('e');
        binarySearchTree.preOrderTraversal();
    }

    @Test
    void testInsert() {
    }

    @Test
    void preOrderTraversal() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(2);
        binarySearchTree.insert(1);
        binarySearchTree.insert(3);
        binarySearchTree.preOrderTraversal();
    }

    @Test
    void postOrderTraversal() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(2);
        binarySearchTree.insert(1);
        binarySearchTree.insert(3);
        binarySearchTree.postOrderTraversal();
    }

    @Test
    void inOrderTraversal() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(2);
        binarySearchTree.insert(1);
        binarySearchTree.insert(3);
        binarySearchTree.inOrderTraversal();
    }

    @Test
    void search() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(2);
        binarySearchTree.insert(1);
        binarySearchTree.insert(3);
        System.out.println(binarySearchTree.search(4));
    }

    @Test
    void minValue() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(2);
        binarySearchTree.insert(1);
        binarySearchTree.insert(3);
        System.out.println(binarySearchTree.minValue());
    }

}