package org.dsa.dsa.doublylinkedlist.re;

public class DoublyLinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int length;

    //default constructor
    public DoublyLinkedList() {
    }

    //constructor with initial value
    public DoublyLinkedList(T data) {
        Node<T> newNode = new Node<>(data);
        head = tail = newNode;
        length = 1;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int size() {
        return length;
    }

    public void printList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) { // DoublyLinkedList is empty head and tail both are same node
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node<T> removeFromLast() {
        if (isEmpty())
            return null;
        Node<T> temp = tail;
        if (size() == 1) {
            head = tail = null;
        } else {
            tail = temp.prev;
            tail.next = null;
            temp.next = null;
        }
        length--;
        return temp;
    }
    public void preAppend(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()){
            head = tail = newNode;
        } else  {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }
    public Node<T> removeFromFirst() {
        if (isEmpty()){
            return null;
        }
        Node<T> temp = head;
        if (size() == 1){
            head = tail = null;
        }else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length --;
        return temp;
    }

}
