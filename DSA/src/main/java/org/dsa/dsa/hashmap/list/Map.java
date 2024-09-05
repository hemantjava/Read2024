package org.dsa.dsa.hashmap.list;

public interface Map<K,V> {
    void put(K key, V value);
    V get(K key);
    V remove(K key);
    boolean containsKey(K key);
    int size();
    boolean isEmpty();
    void print();
}
