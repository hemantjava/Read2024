package org.dsa.dsa.stack.node;

public class Stack<T> {
    private Node<T> top;
    private int size; //optional

    Stack() {}

    Stack(T data) {
        this.top = new Node<>(data);
        size = 1;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void printStack() {
        Node<T> temp = top; // don't affect existing top values
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (!isEmpty()) {
            newNode.next = top;
        }
        top = newNode;
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

}
