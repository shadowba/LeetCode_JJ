package com.LeetCodeJack.Problems2;

import java.util.Arrays;

public class P414_E_ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
        int N = nums.length;
        Arrays.sort(nums);
        int readPointer = 1;
        int writePointer = 1;
        if (N <= 2) return nums[N - 1];
        for (readPointer = 1; readPointer < N; readPointer++) {
            if (nums[readPointer] != nums[readPointer - 1]) {
                nums[writePointer++] = nums[readPointer];
            }
        }
        if (writePointer <= 2) return nums[writePointer - 1];
        else return nums[writePointer - 3];
    }
}
