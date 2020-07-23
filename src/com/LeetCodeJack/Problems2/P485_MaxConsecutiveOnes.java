package com.LeetCodeJack.Problems2;

public class P485_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res, tempLength, N, left, right;
        N = res = tempLength = left = right = 0;
        if (nums.length == 0 || nums == null) return res;
        N = nums.length;
        while (left <= N - 1 && right <= N - 1) {
            if (nums[left] == 0) {
                left++;
                continue;
            }
            right = left;
            while (right <= N - 1 && nums[right] == 1) {
                tempLength = right - left + 1;
                res = Math.max(res, tempLength);
                right++;
            }
            left = right;
        }
        return res;
    }
}
