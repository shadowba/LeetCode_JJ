package com.LeetCodeJack.Problems;

public class P53_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int maxRes = nums[0];
        int maxToCur = nums[0];
        for (int i = 0; i < nums.length; i++) {
            maxToCur = Math.max(nums[i], maxToCur + nums[i]);
            maxRes = Math.max(maxToCur, maxRes);
        }
        return maxRes;
    }
}
