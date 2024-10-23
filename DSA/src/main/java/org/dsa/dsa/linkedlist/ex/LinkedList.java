package org.dsa.dsa.linkedlist.ex;

import lombok.Getter;

public class LinkedList<T> {
    Node<T> head;
    @Getter
    int length;

    public LinkedList(T data) {
        head = new Node<>(data);
        length++;
    }

    public LinkedList() {

    }

    public int size() {
        return length;
    }

    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void recursivePrint() {
        recursive(head);
    }

    public void recursiveReversePrint() {
        recursiveReverse(head);
    }

    private void recursive(Node<T> head) {
        if (head == null)
            return;
        System.out.println(head.data + " ");
        recursive(head.next);
    }

    private void recursiveReverse(Node<T> head) {
        if (head == null)
            return;
        recursive(head.next);
        System.out.println(head.data + " ");
    }

    private Node<T> getNewNode(T data) {
        return new Node<>(data);
    }

    public void preAppend(T data) {
        Node<T> newNode = getNewNode(data);
        if (head == null) {
            head = newNode;
            length++;
            return;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void append(T data) {
        Node<T> newnode = getNewNode(data);
        if (head == null) {
            head = newnode;
            length++;
            return;
        }
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newnode;
    }

    public Node<T> getDataByIndex(int index) {
        Node<T> temp = head;
        if (temp == null) {
            return null;
        }
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void updateByIndex(int index, T data) {
        Node<T> temp = getDataByIndex(index);
        if (temp == null) {
            return;
        }
        temp.data = data;
    }

    public Node<T> deleteFirst() {
        Node<T> temp = head;
        if (temp == null) {
            return null;
        }
        head = head.next;
        return temp;
    }

    public Node<T> deleteEnd() {
        Node<T> temp = head;
        if (temp == null)
            return null;
        while (temp.next.next != null) { // loop over before last node
            temp = temp.next;
        }
        Node<T> del = temp.next;
        temp.next = null;
        return del;
    }

    public void reverseLinkedList() {
        // 3 pointers
        Node<T> current = head;
        Node<T> next = null;
        Node<T> previous = null;
        while (current != null) {
            //swapping
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public T findMiddleElement() {
        // Edge case: if the list is empty, return null
        Node<T> current = head;
        if (current == null) {
            return null;
        }
        // Initialize slow and fast pointers
        Node<T> fast = current;
        Node<T> slow = current;
        // Move fast by 2 steps and slow by 1 step
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    //check if the LinkedList has cycle
    public boolean isCycle() {

        // Initialize slow and fast pointers
        Node<T> fast = head;
        Node<T> slow = head;
        // Move fast by 2 steps and slow by 1 step
        while (fast != null && fast.next != null) {
            slow = slow.next; //1+
            fast = fast.next.next;
            if (slow == fast)
                return true; //cycle exist
        }
        return false;
    }
}
