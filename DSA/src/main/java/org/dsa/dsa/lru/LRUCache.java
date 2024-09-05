package org.dsa.dsa.lru;

import java.util.HashMap;
import java.util.Map;

// Sure! Here's an example of an LRU (Least Recently Used) cache implementation in Java using a combination of a doubly linked list and a HashMap:
public class LRUCache {
    private class Node {
        int key;
        int value;
        Node prev;
        Node next;
    }

    private int capacity;
    private Map<Integer, Node> cache;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node != null) {
            removeNode(node);
            addNodeToHead(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        Node node = cache.get(key);
        if (node != null) {
            node.value = value;
            removeNode(node);
        } else {
            if (cache.size() == capacity) {
                Node tailPrev = tail.prev;
                removeNode(tailPrev);
                cache.remove(tailPrev.key);
            }
            node = new Node();
            node.key = key;
            node.value = value;
        }
        addNodeToHead(node);
        cache.put(key, node);
    }

    private void removeNode(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    private void addNodeToHead(Node node) {
        Node nextNode = head.next;
        head.next = node;
        node.prev = head;
        node.next = nextNode;
        nextNode.prev = node;
    }
}
