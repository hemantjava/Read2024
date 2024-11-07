package org.dsa.dsa.doublylinkedlist.re;

public class Node<T> {
    Node<T> next;
    Node<T> prev;
    public T data;
    public Node(T data) {
        this.data = data;
    }
}
