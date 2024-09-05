package org.dsa.dsa.linkedlist;

public class Main {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(10);
        head.next = new Node<>(50);
        head.next.next = new Node<>(100);
      //  System.out.println(head.data);
      //  System.out.println(head.next.data);
       // System.out.println(head.next.next.data);

        LinkedList<Integer> ll = new LinkedList<>(2);
        ll.preAppend(4);
        ll.preAppend(8);
        ll.preAppend(11);
        ll.append(3);
        ll.printList();
        System.out.println(ll.getData(2));
        ll.printList();
        System.out.println(ll.deleteFirst().data);
        System.out.println(ll.deleteLast().data);
        ll.append(6);
        ll.append(9);
        ll.printList();//8469
        System.out.println(ll.searchIndex(6));
        System.out.println(ll.searchIndex(1));
    }
}
