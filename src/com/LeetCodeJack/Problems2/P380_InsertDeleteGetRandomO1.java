package com.LeetCodeJack.Problems2;

import java.util.*;

public class P380_InsertDeleteGetRandomO1 {
    Map<Integer, Integer> setMap;
    List<Integer> numList;

    /**
     * Initialize your data structure here.
     */
    public P380_InsertDeleteGetRandomO1() { //public RandomizedSet()
        setMap = new HashMap<>();
        numList = new LinkedList<>();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (setMap.containsKey(val)) return false;
        numList.add(val);
        setMap.put(val, val);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (!setMap.containsKey(val)) return false;
        numList.remove(setMap.get(val));
        setMap.remove(val);
        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        int idx = (int) (Math.random() * numList.size());
        idx = (idx < 0) ? 0:idx;
        return numList.get(idx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
