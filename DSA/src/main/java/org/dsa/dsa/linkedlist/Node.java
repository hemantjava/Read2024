package org.dsa.dsa.linkedlist;

public class Node<T> {
     T data;  // to hold data or value
     Node<T> next; //to next node pointer

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", nextNode=" + next +
                '}';
    }

}