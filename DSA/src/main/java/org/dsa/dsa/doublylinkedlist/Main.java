package org.dsa.dsa.doublylinkedlist;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>(7);
        System.out.println(dll);
        dll.printList();
        System.out.println("=====append======");
        dll.append(2);
        dll.append(5);
        System.out.println(dll);
        dll.printList();
        System.out.println("=====removeLast======");
        System.out.println(dll.removeLast().value);
        System.out.println(dll);
        dll.printList();
        System.out.println("=====preAppend======");
        dll.preAppend(9);
        System.out.println(dll);
        dll.printList();
        System.out.println("=====removeFirst======");
        System.out.println( dll.removeFirst().value);
        dll.printList();
        System.out.println("===========get=============");
        System.out.println(dll.get(1).value);
        System.out.println(dll.get(5));
        dll.printList();
        System.out.println("===========set=============");
        System.out.println(dll.set(1,1));
        dll.printList();
        System.out.println("===========insert=============");
        System.out.println(dll.insert(1,8));
        dll.printList();
        System.out.println(dll);
        System.out.println("===========remove=============");
        System.out.println(dll.remove(1).value);
        dll.printList();
        System.out.println(dll);
    }
}
