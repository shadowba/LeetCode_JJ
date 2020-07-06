package com.LeetCodeJack.Problems;

import java.util.Hashtable;
import java.util.Map;
import java.util.HashMap;

public class P136_SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> visited = new HashMap<>();

        for (int i : nums) {
            visited.put(i,visited.getOrDefault(i,0)+1);
        }
        for (int key : nums) {
            if (visited.get(key) == 1)
                return key;
        }
        return -1;
    }
}
