package org.dsa.dsa.binarysearchtree.recursion;

public class Node<T extends Comparable<T>> {
    T data;
    Node<T> left;
    Node<T> right;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "[" + data + "]";
    }
}