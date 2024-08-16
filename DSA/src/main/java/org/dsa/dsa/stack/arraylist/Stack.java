package org.dsa.dsa.stack.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private final List<T> items;

    public Stack() {
        items = new ArrayList<>();
    }

    public void push(T t) {
        items.add(t);
    }

    public boolean empty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

    public T pop() {
        if (empty())
            throw new IllegalStateException("Stack is empty");
        return items.remove(size() - 1);
    }

    public T peek() {
        if (empty())
            throw new IllegalStateException("Stack is empty");
        return items.get(size() - 1);
    }

    public T search(T t) {
        if (empty())
            throw new IllegalStateException("Stack is empty");
        return items.parallelStream().filter(x -> x.equals(t)).findFirst().orElse(null);
    }

    public void print() {
        List<T> temp = items;
        for (int i = temp.size() - 1; i >= 0; i--) {
            System.out.print(temp.get(i) + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("sonu");
        stack.push("sahu");
        stack.push("kumar");
        stack.print();
        System.out.println(stack.size());
        System.out.println(stack.empty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.print();
        System.out.println(stack.search("sonu"));

    }
}
