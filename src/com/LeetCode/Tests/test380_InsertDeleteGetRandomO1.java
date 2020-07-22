package com.LeetCode.Tests;

import com.LeetCodeJack.Problems2.P380_InsertDeleteGetRandomO1;

public class test380_InsertDeleteGetRandomO1 {
    public static void main(String[] args) {
        P380_InsertDeleteGetRandomO1 randomSet = new P380_InsertDeleteGetRandomO1();
        randomSet.insert(1);

// Returns false as 2 does not exist in the set.
        randomSet.remove(2);

// Inserts 2 to the set, returns true. Set now contains [1,2].
        randomSet.insert(2);

// getRandom should return either 1 or 2 randomly.
        randomSet.getRandom();

// Removes 1 from the set, returns true. Set now contains [2].
        randomSet.remove(1);

// 2 was already in the set, so return false.
        randomSet.insert(2);

// Since 2 is the only number in the set, getRandom always return 2.
        randomSet.getRandom();
    }
}
