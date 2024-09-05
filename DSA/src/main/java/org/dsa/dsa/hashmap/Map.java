package org.dsa.dsa.hashmap;

public interface Map<K, V> {
    void put(K key, V value);

    V get(K key);

    V remove(K key);

    void print();
}
