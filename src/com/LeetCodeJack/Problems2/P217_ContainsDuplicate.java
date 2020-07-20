package com.LeetCodeJack.Problems2;

import java.util.HashSet;

public class P217_ContainsDuplicate {
    HashSet<Integer> hashSet = new HashSet<>();
    public boolean containsDuplicate(int[] nums) {
        for(int num : nums){
            if(hashSet.contains(num))
                return true;
            hashSet.add(num);
        }
        return false;
    }
}
