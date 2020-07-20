package com.LeetCodeJack.Problems2;

import java.util.*;

public class P219_ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 0 || nums == null || k <= 0)
            return false;

        TreeSet<Integer> numSet = new TreeSet<>();
        int num;
        for(int i = 0; i < nums.length; i++){
            num = nums[i];

            if(numSet.size() > k)
                numSet.remove(nums[i - k - 1]);
            if(numSet.contains(num))
                return true;
            numSet.add(num);
        }
        return false;
    }
}
