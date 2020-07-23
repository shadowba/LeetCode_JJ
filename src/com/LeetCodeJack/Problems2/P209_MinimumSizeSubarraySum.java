package com.LeetCodeJack.Problems2;

public class P209_MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0 || nums == null)
            return 0;
        int left = 0;
        int minL = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= s) {
                minL = Math.min(minL, i - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return (minL == Integer.MAX_VALUE) ? 0 : minL;
    }
}
