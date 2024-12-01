package org.dsa.dsa.queue;

public class Main {

    public static void main(String[] args) {

        Queue<Character> queue = new Queue<>('A');
        System.out.println(queue.getFirst());
        System.out.println(queue.getLast());
        queue.enqueue('G');
        queue.enqueue('C');
        System.out.println("=======enqueue()========== ");
        System.out.println(queue);
        queue.printQueue();
        System.out.println(queue.dequeue());
        System.out.println("=======dequeue()========== ");
        System.out.println(queue);
        queue.enqueue('D');
        queue.enqueue('Z');
        queue.printQueue();
        queue.reverseQueue();
        queue.printQueue();

    }
}
