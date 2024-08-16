package org.dsa.dsa.stack.node;

public class Stack<T> {
    private Node<T> top;
    private int size; //optional

    Stack() {
        top = null; //optional
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (!isEmpty()) {
            newNode.next = top;
        }
        top = newNode; //    now newNode pointing top position
        size++;
    }

    public T firstElement() {
        if (isEmpty())
            return null;
        Node<T> temp = top;
        while (temp.next != null)
            temp = temp.next;
        return temp.data;
    }

    public T peek() {
        if (isEmpty())
            throw new IllegalStateException("Stack is empty");
        return top.data;
    }

    public void printStack() {
        Node<T> temp = top; // don't effect existing top values
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public T pop() {
        if (isEmpty())
            throw new IllegalStateException("Stack is empty");
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack);
        System.out.println("size:" + stack.size());
        stack.push(3);
        stack.push(4);
        stack.push(9);
        System.err.println("size:" + stack.size());
        System.err.println(stack);
        System.err.println("printStack");
        stack.printStack();
        System.out.println("firstElement():" + stack.firstElement());
        System.out.println("peek():" + stack.peek());
        System.out.println("pop():" + stack.pop());
        System.out.println("printStack");
        stack.printStack();
    }

    private static class Node<T> {
        Node<T> next;
        T data;

        Node(T data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", data=" + data +
                    '}';
        }
    }


}
