package org.dsa.dsa.stack.node;

public class Node<T> {
    Node<T> next;
    T data;

    Node(T data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }
}