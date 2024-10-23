package org.dsa.interview.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Interleave {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <=10; i++){
            queue.add(i);
        }
        queue.forEach(x -> System.out.print(x+" "));
        interleave(queue);
    }

    private static void interleave(Queue<Integer> queue) {
        int size = queue.size(); // fixed size
        Queue<Integer> newQueue = new LinkedList<>();
        for (int i =0; i < size/2; i++) {
            newQueue.add(queue.remove());
        }
        while (!newQueue.isEmpty()){
            queue.add(newQueue.remove());
            queue.add(queue.remove());
        }
        System.out.println();//new line
        queue.forEach(x -> System.out.print(x+" "));
    }
}
