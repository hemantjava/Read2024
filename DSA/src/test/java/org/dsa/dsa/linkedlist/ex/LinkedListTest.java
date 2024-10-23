package org.dsa.dsa.linkedlist.ex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void print() {
        LinkedList<Integer> list = new LinkedList<>(2);
        list.head.next = new Node<>(3);
        list.head.next.next = new Node<>(11);
        list.head.next.next.next = new Node<>(12);
        list.head.next.next.next.next = new Node<>(33);
        list.print();
    }

    @Test
    void size() {
    }

    @Test
    void recursivePrint() {
        LinkedList<Integer> list = new LinkedList<>(2);
        list.head.next = new Node<>(3);
        list.head.next.next = new Node<>(11);
        list.head.next.next.next = new Node<>(12);
        list.head.next.next.next.next = new Node<>(33);
        list.recursivePrint();
    }

    @Test
    void getLength() {
    }

    @Test
    void recursiveReversePrint() {
        LinkedList<Integer> list = new LinkedList<>(2);
        list.head.next = new Node<>(3);
        list.head.next.next = new Node<>(11);
        list.head.next.next.next = new Node<>(12);
        list.head.next.next.next.next = new Node<>(33);
        list.recursiveReversePrint();
    }

    @Test
    void preAppend() {
        LinkedList<Integer> list = new LinkedList<>(2);
        list.preAppend(23);
        list.preAppend(24);
        list.print(); // 24 23 2
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.preAppend(200);
        list1.print();
    }

    @Test
    void append() {
    }

    @Test
    void getDataByIndex() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.append(200);
        list1.append(20);
        list1.append(21);
        list1.append(28);
        list1.print(); // 200 20 21 28
        System.out.println(list1.getDataByIndex(0).data);//21
    }

    @Test
    void updateByIndex() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.append(200);
        list1.append(20);
        list1.append(21);
        list1.append(28);
        list1.print(); // 200 20 21 28
        list1.updateByIndex(3,300);
        list1.print();// 200 20 21 300
    }

    @Test
    void deleteFirst() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.append(200);
        list1.append(20);
        list1.append(21);
        list1.append(28);
        list1.print(); // 200 20 21 28
        list1.deleteFirst();
        list1.print(); // 20 21 28
    }

    @Test
    void deleteEnd() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.append(200);
        list1.append(20);
        list1.append(21);
        list1.append(28);
        list1.print(); // 200 20 21 28
        list1.deleteEnd();
        list1.print(); // 200 20 21
    }
    @Test
     void reverseLinkedList(){
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.append(200);
        list1.append(20);
        list1.append(21);
        list1.append(28);
        list1.print(); // 200 20 21 28
        list1.reverseLinkedList();
        list1.print(); // 28 21 20 200
    }

    @Test
    void findMiddleElement() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.append(200);
        list1.append(20);
        list1.append(21);
        list1.append(28);
       // list1.append(29);
        list1.print();
        System.out.println(list1.findMiddleElement());
    }

    @Test
    void testIsCycle() {
        LinkedList<Integer> list = new LinkedList<>(1);
        list.head.next = new Node<>(2);
        list.head.next.next = new Node<>(3);
        list. head.next.next.next = new Node<>(4);
        list.head.next.next.next.next = list.head;
        System.out.println(list.isCycle());
    }
}