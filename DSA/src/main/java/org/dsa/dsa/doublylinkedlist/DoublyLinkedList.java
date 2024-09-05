package org.dsa.dsa.doublylinkedlist;

public class DoublyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int length;

    static class Node<T> {
        Node<T> nextNode;
        Node<T> preNode;
        T value;

        Node(T value) {
            this.value = value;
        }
    }

    @Override
    public String toString() {
        return "DoublyLinkedList{" +
                "head=" + head.value +
                ", tail=" + tail.value +
                ", length=" + length +
                '}';
    }

    private boolean isEmpty() {
        return length == 0;
    }

    public DoublyLinkedList(T value) {
        Node<T> newNode = new Node<>(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.nextNode;
        }
    }

    public void append(T value) {
        Node<T> newNode = new Node<>(value);
        /**
         *  if (isEmpty()) {
         *             head = newNode;
         *             tail = newNode;
         *         } else {
         *             tail.nextNode = newNode;
         *             newNode.preNode = tail;
         *             tail = newNode;
         *         }
         *         length++;
         */
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.nextNode = newNode;
            newNode.preNode = tail;
        }
        tail = newNode;
        length++;
    }

    public Node<T> removeLast() {
        if (isEmpty()) return null;
        Node<T> temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.preNode;
            tail.nextNode = null;
            temp.preNode = null;
        }
        length--;
        return temp;
    }

    public void preAppend(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.nextNode = head; // here newNode pointing head node
            head.preNode = newNode;
            head = newNode; //newNode become head
        }
        length++;
    }

    public Node<T> removeFirst() {
        if (isEmpty()) return null;
        Node<T> temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.nextNode; //move head to next index
            head.preNode = null; //remove connection to previous node
            temp.nextNode = null;
        }
        length--;
        return temp;
    }

       /* for (int i = 0; i < index; i++) {
             temp = temp.nextNode;
        }
        return temp;*/ //similar to singly linkedlist
    //   More efficient way

    public Node<T> get(int index) {
        if (index < 0 || index >= length)
            return null;
        Node<T> temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.nextNode;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.preNode;
            }
        }
        return temp;
    }

    public boolean set(int index, T value) { //update
        Node<T> temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, T value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            preAppend(value);
            return true;
        } else if (index == length) {
            append(value);
            return true;
        }
        Node<T> newNode = new Node<>(value);
        Node<T> before = get(index - 1);
        Node<T> after = before.nextNode;
        newNode.preNode = before;
        newNode.nextNode = after;
        before.nextNode = newNode;
        after.preNode = newNode;
        length++;
        return true;
    }

    public Node<T> remove(int index) {
        if (index < 0 || index >= length) return null;
        else if (index == 0)
            return removeFirst();
        else if (index == length-1)
            return removeLast();
        Node<T> temp = get(index);
        temp.nextNode.preNode = temp.preNode;
        temp.preNode.nextNode = temp.nextNode;
        temp.nextNode = null;
        temp.preNode = null;
        length--;
        return temp;
    }
}



