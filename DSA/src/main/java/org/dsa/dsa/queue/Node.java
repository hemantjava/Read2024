package org.dsa.dsa.queue;

public class Node<T>{  // inner class
    T value;
    Node<T> next;
    Node(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", value=" + value +
                '}';
    }
}