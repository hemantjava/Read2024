package org.dsa.dsa.hashmap.list;

import java.util.LinkedList;
import java.util.List;

public class HashMap<K, V> implements Map<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private LinkedList<Entry<K, V>>[] buckets;
    private int capacity;
    private int size;

    public HashMap() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public HashMap(int capacity) {
        this.capacity = capacity;
        size = 0;
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }

    }


    @Override
    public void put(K key, V value) {
        int index = hash(key);
        List<Entry<K, V>> entries = buckets[index];
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) { // if key is duplicate
                entry.setValue(value);
                return;
            }
        }
        entries.add(new Entry<>(key, value));
        size++;
        if (size() > capacity * .75) {
            resize();
        }
    }

    private void resize() {
        capacity *= 2;
        List<Entry<K, V>>[] oldBuckets = buckets;
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) { // filled empty new LinkedList
            buckets[i] = new LinkedList<>();
        }
        for (int i = 0; i < oldBuckets.length; i++) {
            List<Entry<K, V>> newBuckets = oldBuckets[i];
            for (Entry<K, V> entry : newBuckets) {
                put(entry.getKey(), entry.getValue()); //rehashing
            }
        }
    }


    @Override
    public V get(K key) {
        int index = hash(key);
        List<Entry<K, V>> entries = buckets[index];
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public V remove(K key) {
        int index = hash(key);
        List<Entry<K, V>> entries = buckets[index];
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                entries.remove(entry);
                size--;
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        int index = hash(key);
        List<Entry<K, V>> entries = buckets[index];
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key))
                return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % buckets.length);
    }

    @Override
    public void print() {
        for (List<Entry<K, V>> entries : buckets) {
            for (Entry<K, V> entry : entries) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

    private static class Entry<K, V> {
        private final K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
