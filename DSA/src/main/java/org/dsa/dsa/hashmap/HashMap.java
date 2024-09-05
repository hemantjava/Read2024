package org.dsa.dsa.hashmap;

public class HashMap<K, V> implements Map<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private int size;
    private int capacity;
    private Entry<K, V>[] entries;

    public HashMap() {
        this(DEFAULT_CAPACITY);
    }

    public HashMap(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.entries = new Entry[capacity];
    }

    @Override
    public void put(K key, V value) {
        int index = hash(key);
        Entry<K, V> entry = entries[index];
        while (entry != null) { // look for existing node and update the value
            if (entry.key.equals(key)) { // if key exist
                entry.value = value; //update the value
                return;
            }
            entry = entry.next; //check next node
        }
        Entry<K, V> newEntry = new Entry<>(key, value);
        newEntry.next = entries[index];
        entries[index] = newEntry;  //new assigned in index
        size++;
        if (size > capacity * 0.75) {
            resize();
        }
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    public V get(K key) {
        int index = hash(key);
        Entry<K, V> entry = entries[index];
        while (entry != null) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
            entry = entry.next;
        }
        return null;
    }

    @Override
    public V remove(K key) {
        int index = hash(key);
        Entry<K, V> entry = entries[index];
        Entry<K, V> prevEntry = null;
        while (entry != null) {
            if (entry.key.equals(key)) {
                if (prevEntry == null) {
                    entries[index] = entry.next;
                } else {
                    prevEntry.next = entry.next;
                }
                size--;
                return entry.value;
            }
            prevEntry = entry;
            entry = entry.next;
        }
        return null;
    }

    @Override
    public void print() {
        for (Entry<K, V> entry : entries) {
            while (entry != null) {
                System.out.print(entry.key + " : " + entry.value + " ");
                entry = entry.next;
            }

        }
        System.out.println();
    }

    public boolean containsKey(K key) {
        int index = hash(key);
        Entry<K, V> entry = entries[index];
        while (entry != null) {
            if (entry.key.equals(key)) {
                return true;
            }
            entry = entry.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    private void resize() {
        capacity *= 2;
        Entry<K, V>[] oldEntries = entries;
        entries = new Entry[capacity];
        for (Entry<K, V> entry : oldEntries) {
            while (entry != null) {
                put(entry.key, entry.value);
                entry = entry.next;
            }
        }
    }

    private static class Entry<K, V> {
        private final K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
