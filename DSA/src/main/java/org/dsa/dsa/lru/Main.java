package org.dsa.dsa.lru;

public class Main {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(10);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);
        lruCache.put(4, 4);
        lruCache.put(5, 5);
        lruCache.put(6, 6);
        lruCache.put(7, 7);
        lruCache.put(8, 8);
        lruCache.put(9, 9);
        lruCache.put(10, 10);
        lruCache.put(11, 11);
        lruCache.put(12, 12);
        lruCache.put(13, 13);
        lruCache.put(14, 14);
        lruCache.put(15, 15);
        int i = lruCache.get(12);
        System.out.println(i);
    }
}
