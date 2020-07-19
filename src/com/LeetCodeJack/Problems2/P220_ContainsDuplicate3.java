package com.LeetCodeJack.Problems2;

import java.util.TreeSet;

public class P220_ContainsDuplicate3 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums == null || nums.length == 0 || k <= 0)
            return false;

        TreeSet<Integer> valuesBST = new TreeSet<>();
        for (int i = 0; i < nums.length; i++){
            Integer ceil = valuesBST.ceiling(nums[i]);
            if(ceil != null && (long)ceil - (long)nums[i] <= t )
                return true;

            Integer floor = valuesBST.floor(nums[i]);
            if(floor != null && (long)nums[i] - (long)floor >= t)
                return true;
            valuesBST.add(nums[i]);
            if(i >= k)
                valuesBST.remove(nums[i-k]);
        }
        return false;
    }
}
