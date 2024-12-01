package org.dsa.dsa.queue;


import java.util.Stack;

public class Queue<T> {

    private Node<T> first;
    private Node<T> last;
    private int length;

    public Queue(T value){
        Node<T> newNode = new Node<>(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "first=" + first +
                ", last=" + last +
                ", length=" + length +
                '}';
    }


    public T getLast() {
        return last.value;
    }

    public T getFirst() {
        return first.value;
    }

    public void printQueue(){
        StringBuilder sb = new StringBuilder();
        if (length == 0)
            sb.append("[]");
        else {
            Node<T> temp = first;
            while (temp!= null){
                sb.append(temp.value).append(" ");
                temp = temp.next;
            }
        }
        System.out.println(sb);
    }

    // insert operation in the last of the queue
    public void enqueue(T value){
        Node<T> newNode = new Node<>(value);
        //it means queue is empty
        if (length == 0){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode; //now newNode is last node
        }
        length++;

    }

    //deletion from 1st in queue
    public Node<T> dequeue(){
        if (length == 0) return null; // if empty queue
        Node<T> temp = first;
        if (length == 1){ //special case
            first = null;
            last = null;
        }else {
            first = first.next; //2nd element in the queue
            temp.next = null; // temp and first node pointing same address
        }
        length--;
        return temp;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void reverseQueue(){
        Stack<T> stack = new Stack<>();

        while (!isEmpty()){
            stack.push(dequeue().value);
        }
        while (!stack.isEmpty()){
            enqueue(stack.pop());
        }
    }



}
