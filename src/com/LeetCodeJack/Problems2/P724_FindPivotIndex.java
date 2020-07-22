package com.LeetCodeJack.Problems2;

public class P724_FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int sum, leftSum, rightSum;
        sum = leftSum = rightSum = 0;
        for (int num : nums) sum += num;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - nums[i] - leftSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
