package com.LeetCodeJack.Problems3;

public class P152_M_MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int prevMax = nums[0];
        int prevMin = nums[0];
        int curMin = nums[0];
        int curMax = nums[0];
        int res = nums[0];
        for(int i = 1; i < nums.length; i++){
            curMax = Math.max(nums[i], Math.max(prevMax*nums[i], prevMin*nums[i]));
            curMin = Math.min(nums[i], Math.min(prevMax*nums[i], prevMin*nums[i]));
            res = Math.max(res, curMax);
            prevMax = curMax;
            prevMin = curMin;
        }
        return res;
    }
}
