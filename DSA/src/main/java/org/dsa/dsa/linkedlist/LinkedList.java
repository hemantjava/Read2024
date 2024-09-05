package org.dsa.dsa.linkedlist;

public class LinkedList<T> {

    private Node<T> head;
    private int length;

    public Node<T> getHead() {
        return head;
    }

    public LinkedList(T t) {
        final Node<T> newNode = getNewNode(t);
        head = newNode;
        length++;
    }

    public LinkedList() {
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", length=" + length +
                '}';
    }

    public void printList() {
        if (length != 0) {
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        } else {
            System.out.print("[]");
        }
        System.out.println();
    }

    //Extra auxiliary space O(n)
    private void printRecursive(Node<T> headNode) {
        if (headNode == null) {
            System.out.println();
            return;
        }
        System.out.print(headNode.data + " ");
        printRecursive(headNode.next);
    }

    public void printRecursive() {
        printRecursive(head);
    }


    private Node<T> getNewNode(T t) {
        return new Node<>(t);
    }

    public void preAppend(T t) {
        Node<T> newNode = new Node<>(t);
        if (isEmpty()) {
            head = newNode;
            length++;
            return;
        }
        newNode.next = head;
        head = newNode; // Head updated with new node
        length++;
    }

    public void append(T t) {
        Node<T> newNode = new Node<>(t);
        if (isEmpty()) {
            head = newNode;
            length++;
            return;
        }
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //get indexed node
    public Node<T> getNode(int index) {
        if (index < 0 || index >= length) return null;
        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next; // temp indexed time
        }
        return temp;
    }

    public T getData(int index) {
        if (index < 0 || index >= length) return null;
        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next; // temp indexed time
        }
        return temp.data;
    }

    public boolean set(int index, T value) {  //update operation
        Node<T> temp = getNode(index); //get index value
        if (temp != null) {
            temp.data = value; //updating indexed data
            return true;
        }
        return false;
    }

    public Node<T> deleteFirst() {
        if (isEmpty()) {
            return null;
        }
        Node<T> temp = head;
        head = head.next;
        length--;
        return temp;
    }

    public Node<T> deleteLast() {
        if (isEmpty()) {
            return null;
        }
        Node<T> temp = getNode(size() - 2);
        Node<T> delNode = temp.next;
        temp.next = null;
        length--;
        return delNode;
    }

    void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current; //head,current 2nd
            current = next;
        }

        head = previous;
    }

    private Node reverseRecursion(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node reversedList = reverseRecursion(node.next);
        node.next.next = node;
        node.next = null;

        return reversedList;
    }

    void reverseRecursion() {
        head = reverseRecursion(head);
    }

    public int searchIndex(T data) {
        Node<T> temp = head;
        int index = 0;
        while (temp.next != null) {
            if (temp.data == data)
                return index;
            index++;
            temp = temp.next;
        }
        return -1;
    }


}
