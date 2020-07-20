package com.LeetCodeJack.Problems2;

import java.util.Arrays;

public class P706_DesignHashMap {
    int[][] hashMap;
    int bucket;
    int slot;

    /**
     * Initialize your data structure here.
     */
    public P706_DesignHashMap() { // MyHashMap
        hashMap = new int[1000][];
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        bucket = key / 1000;
        slot = key % 1000;

        if(hashMap[bucket] == null){
            int[] temp = new int[1000];
            Arrays.fill(temp, -1);
            hashMap[bucket] = temp;
        }

        hashMap[bucket][slot] = value;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        bucket = key / 1000;
        slot = key % 1000;
        if (hashMap[bucket] == null || hashMap[bucket][slot] < 0)
            return -1;
        return hashMap[bucket][slot];
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        bucket = key / 1000;
        slot = key % 1000;
        if (hashMap[bucket] == null || hashMap[bucket][slot] < 0)
            return;
        hashMap[bucket][slot] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */