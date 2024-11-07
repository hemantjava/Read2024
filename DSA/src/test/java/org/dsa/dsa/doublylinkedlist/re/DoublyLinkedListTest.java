package org.dsa.dsa.doublylinkedlist.re;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    void printList() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>("foo");
        System.out.println(list.isEmpty());
        list.printList();
    }

    @Test
    void append() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>("foo");
        list.append("bar");
        list.append("baz");
        list.printList();
        System.out.println(list.size());

    }
    @Test
    void isEmpty() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>("foo");
        System.out.println(list.isEmpty());
    }

    @Test
    void removeFromLast() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>("foo");
        list.append("bar");
        list.append("baz");
        System.out.println("size :"+list.size());
        list.printList();
        System.out.println(list.removeFromLast().data);
        System.out.println("size: "+list.size());
        list.printList();
    }
    @Test
    void size() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>("foo");
        System.out.println(list.size());
    }

    @Test
    void preAppend() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>("foo");
        list.append("bar");
        list.append("baz");
        list.preAppend("hem");
        list.printList();
        System.out.println("size:"+list.size());
    }
}