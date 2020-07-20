package com.LeetCodeJack.Problems2;

public class P705_DesignHashSet {
    int[][] hashSet;

    /**
     * Initialize your data structure here.
     */
    public P705_DesignHashSet() { // MyHashSet
        hashSet = new int[1000][];
    }

    public void add(int key) {
        int bucket = key % 1000;
        if (hashSet[bucket] == null)
            hashSet[bucket] = new int[1000];
        hashSet[bucket][key / 1000] = key;
    }

    public void remove(int key) {
        int bucket = key % 1000;
        if(hashSet[bucket] == null)
            return;
        if (hashSet[bucket][key / 1000] == key)
            hashSet[bucket][key / 1000] = 0;
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        int bucket = key % 1000;
        if(hashSet[bucket] == null)
            return false;
        if (hashSet[bucket][key / 1000] == key)
            return true;
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
